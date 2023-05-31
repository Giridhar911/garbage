/*

Program - 07

Write a program in C using POSIX thread library to implement a process with a
producer thread and a consumer thread which makes use of a bounded buffer (Fixed
Size of 512kb) for communication. Use appropriate synchronization techniques.

*/

#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>

#define buffer_limit 10
int index_value = 0,i,j;
int buffer[buffer_limit];

pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
pthread_cond_t buffer_full = PTHREAD_COND_INITIALIZER;
pthread_cond_t buffer_empty = PTHREAD_COND_INITIALIZER;

void *consumer()
{
	for(j=0; j<buffer_limit; j++)
	{
		pthread_mutex_lock(&mutex);
		if(index_value == -1)
		{
			pthread_cond_wait(&buffer_empty, &mutex);
		}
		
		printf("\n Consumer : %d \t", index_value--);
		pthread_mutex_unlock(&mutex);
		pthread_cond_signal(&buffer_full);
	}
}

void *producer()
{
	for(i=0; i<buffer_limit; i++)
	{
		pthread_mutex_lock(&mutex);
		if(index_value == buffer_limit)
		{
			pthread_cond_wait(&buffer_full, &mutex);
		}
		buffer[index_value++] = rand()%50;
		printf("\n Producer : %d \t", index_value);
		pthread_mutex_unlock(&mutex);
		pthread_cond_signal(&buffer_empty);
		
	}
}

int main()
{
	pthread_t pro_tid, con_tid;
	pthread_create(&pro_tid, NULL, &producer, NULL);
	pthread_create(&con_tid, NULL, &consumer, NULL);
	pthread_join(pro_tid, NULL);
	pthread_join(con_tid, NULL);
	return 0;
}
