/*

Program - 06

Design and execute a program in C using POSIX thread library to create the
number of threads specified by the user. Each thread independently generates a
random integer as an upper limit and then computes and prints the number of primes
less than or equal to that upper limit, along with the upper limit.

*/

#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>

#define N 2
int y;
int flag = 0;
pthread_mutex_t m1 = PTHREAD_MUTEX_INITIALIZER;

void *check_prime()
{
	int i,j;
	int count = 0;
	pthread_mutex_lock(&m1);
	y = (rand() % 50);
	printf("The random number is : %d \n",y);
	for(i=0; i<=y; i++)
	{
		flag = 0;
		for(j=2; j<=i/2; j++)
		{
			if(i%j == 0)
			{
				flag = 1;
				break;
			}
			
		}
		
		if(flag == 0 && i>=2)
		{
			count++;
			printf("Prime number %d \n",i);
		}		
	}	
	printf("\n Prime count = %d \n",count);
	pthread_mutex_unlock(&m1);
}

int main()
{
	pthread_t th[N];
	int i,j;
	for(i=0; i<N; i++)
	{
		pthread_create(&th[i], NULL, &check_prime, NULL);
	}
	for(j=0; j<N; j++)
	{
		pthread_join(th[j], NULL);
	}
}
