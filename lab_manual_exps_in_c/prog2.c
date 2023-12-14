/*

Program - 02

Write a program in C using POSIX thread library to create N number of threads USING
shared variable without MUTEX (RACING).

*/

#include <stdio.h>
#include <pthread.h>
#define N 5

int mails = 0;

void *task()
{
	int k;
	for(k=0; k<1000000000; k++)
	{
		mails++;
	}
} 

int main()
{
	pthread_t thread_id[N];
	int i,j;
	for(i=0; i<N; i++)
	{
		pthread_create(&thread_id[i], NULL, &task, NULL);
	}
	
	for(j=0; j<N; j++)
	{
		pthread_join(thread_id[j], NULL);
	}
	printf("The Final Value of mails is: %d \n",mails);
	return 0;
}

