#include <stdio.h>
#include <ctype.h>
#define MAX 1000
int main ()
{
    int shift,pi,ci;
    char plain[MAX],cipher[MAX];
    printf("***encryption and decryption using substitution cipher***\n\n");
    printf("enter the plain text:\n");
    gets(plain);
    while(1)
    {
        printf("\n key (number of shifts per charecter)for encryption:");
        scanf("%d",&shift);
        if(shift<1||shift>25)
            printf("bad input!enter a value between 1 and 25.");
        else
            break;
    }
    printf("\n after removing non alphabetical charecters and capitalizing:\n");
    for(ci=0,pi=0;plain[pi]!='\0';pi++)
    if(isalpha(plain[pi]))
    {
        putchar(toupper(plain[pi]));
        cipher[ci++]=((toupper(plain[pi])-'A')+shift%26)%26+'A';
    }
    cipher[ci]='\0';
    printf("\n\n after encryption :\n%s\n",cipher);
    while(1)
    {
        printf("\n key for decryption:");
        scanf("%d",&shift);
        if(shift<1||shift>25)
            printf("bad input!enter a value between 1 and 25.");
        else
            break;
    }
    for(pi=0,ci=0;cipher[ci]!='\0';ci++)
    plain[pi++]=((cipher[ci]-'A')+(26-shift))%26+'A';
    plain[pi]='\0';
    printf("\n after decryption :\n%s",plain);
    getch();
}