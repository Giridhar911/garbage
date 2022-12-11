/*

Program - 03

Write a program to create the N number of threads and find the how many threads
are executed. Use the concept of Mutual Execution.

*/

#include <stdio.h>
#include <pthread.h>
#define N 5

pthread_mutex_t m1 = PTHREAD_MUTEX_INITIALIZER;
int mails = 0;

void *task()
{
	int k;
	for(k=0; k<100000000; k++)
	{
		pthread_mutex_lock(&m1);
		mails++;
		pthread_mutex_unlock(&m1);
	}
}

int main()
{
	pthread_t th[N];
	int i,j;
	for(i=0; i<N; i++)
	{
		pthread_create(&th[i], NULL, &task, NULL);
	}
	for(j=0; j<N; j++)
	{
		pthread_join(th[j], NULL);
	}
	printf("The Final value of mails is : %d \n",mails);
}
 
