/*

Program - 01 (As executed in the lab by passing only 2 parammeters to pthread_create)

Write a program in C for single Thread Creation and Termination using POSIX thread library.

*/

#include <stdio.h>
#include <pthread.h>

void *fxn_call()
{
	printf("Hello World \n");
}

int main()
{
	pthread_t t1;
	int k;
	k = pthread_create(&t1, NULL, &fxn_call, NULL);
	pthread_join(t1, NULL);
	printf("Thread Status is : %d \n",k);
	return 0;
}
