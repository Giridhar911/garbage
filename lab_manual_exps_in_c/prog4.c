/*

Program - 04

Write a program in C using POSIX thread library for creating independent
threads each of which will execute some random function and use concept of Mutual
Exclusion (Task Synchronization).

*/

#include <stdio.h>
#include <pthread.h>

pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
int counter = 0;

void *threadFn()
{
	pthread_mutex_lock(&mutex);
	counter++;
	printf("Counter value : %d \n",counter);
	pthread_mutex_unlock(&mutex);
}

int main()
{
	pthread_t thread1, thread2;
	pthread_create(&thread1, NULL, &threadFn, NULL);
	pthread_create(&thread2, NULL, &threadFn, NULL);
	pthread_join(thread1, NULL);
	pthread_join(thread2, NULL);
	return 0;
}
