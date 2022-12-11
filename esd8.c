/*

Program - 08

Write a program in C using POSIX thread library to Implement the usage of
anonymous pipe with 512 bytes for data sharing between parent and child process
using inheritance handling mechanism.

*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <unistd.h>

int main(void)
{
	int fd[2];
	pid_t childpid;
	char string[] = "REVA University";
	char readbuffer[80];
	pipe(fd);
	if((childpid=fork())==-1)
	{
		perror("fork");
		return 0;
	}
	else if(childpid == 0)
	{
		close(fd[0]);
		
		write(fd[1], string, strlen(string));
		return 0;
	}
	else
	{
		close(fd[1]);
		read(fd[0], readbuffer, sizeof(readbuffer));
		printf("Received string is : %s \n", readbuffer);
	}
	return 0;
}
