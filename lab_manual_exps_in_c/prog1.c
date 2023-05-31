/*

Program - 01 

Write a program in C for single Thread Creation and Termination using POSIX
thread library.

*/

#include <stdio.h>
#include <pthread.h>

void *print_message_function(void *ptr);

int main()
{
	pthread_t thread1, thread2;
	char *message1 = "Thread 1";
	char *message2 = "Thread 2";
	int iret1, iret2;
	
	//Creating independent threads which will execute an independent fxn
	
	iret1 = pthread_create(&thread1, NULL, print_message_function, message1);
	iret2 = pthread_create(&thread2, NULL, print_message_function, message2);
	pthread_join(thread1, NULL);
	pthread_join(thread2, NULL);
	
	printf("Thread 1 returns : %d \n",iret1);
	printf("Thread 2 returns : %d \n",iret2);
	return 0; 
}

void *print_message_function(void *ptr)
{
	char *message;
	message = (char *) ptr;
	printf("%s \n",message);
}
