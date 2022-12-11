/*

Program - 05

Write a program in C using POSIX thread library to create two threads T1 and
T2. Thread T1 should count numbers between 1-3 and 8-10 and Thread T2 should
count numbers between 4-7. Threads should print final count value.

*/

#include <stdio.h>
#include <pthread.h>

pthread_mutex_t count_mutex = PTHREAD_MUTEX_INITIALIZER;
pthread_cond_t cond_var = PTHREAD_COND_INITIALIZER;

void *fxnCount1();
void *fxnCount2();
int count = 0;

#define COUNT_DONE 10
#define COUNT_HALT1 3
#define COUNT_HALT2 6

int main()
{
	pthread_t thread1, thread2;
	pthread_create(&thread1, NULL, &fxnCount1, NULL);
	pthread_create(&thread2, NULL, &fxnCount2, NULL);
	pthread_join(thread1, NULL);
	pthread_join(thread2, NULL);
	printf("Final Count : %d \n",count);
	return 0;
}

//Writing numbers 1-3 and 8-10 as permitted by fxnCount2()

void *fxnCount1()
{
	while(1)
	{
		//Lock mutex and then wait for signal to release the mutex
		pthread_mutex_lock(&count_mutex);
		//Wait while funCount2() operates on count
		//mutex is unlocked if condition variable in funCount2() is signaled
		pthread_cond_wait(&cond_var, &count_mutex);
		count++;
		printf("Counter value funCount1 : %d \n",count);
		pthread_mutex_unlock(&count_mutex);
		if (count >= COUNT_DONE)
		{
			return(NULL);
		}
	}
	return 0;
}

//Writing numbers 4-7 

void *fxnCount2()
{
	while(1)
	{
		pthread_mutex_lock(&count_mutex);
		if(count < COUNT_HALT1 || count > COUNT_HALT2)
		{
			//Condition of if the statement has been met
			
			pthread_cond_signal(&cond_var);
			
			//Signal to free waiting thread by freeing the mutex
			//fxnCount1() is now permitted to modify "count"
		}
		else
		{
			count++;
			printf("Counter value from fxnCount2 : %d \n",count);
		}
		pthread_mutex_unlock(&count_mutex);
		
		if (count >= COUNT_DONE)
		{
			return(NULL);
		}
	}
}

