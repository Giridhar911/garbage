#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define MAX 1000

int main()
{
    int shift, pi, ci;
    char plain[MAX], cipher[MAX];

    printf("***Encryption and Decryption using Substitution Cipher***\n\n");
    printf("Enter the plain text:\n");
    fgets(plain, MAX, stdin);
    plain[strcspn(plain, "\n")] = '\0'; // Remove trailing newline

    // Encryption
    while (1)
    {
        printf("\nKey (number of shifts per character) for encryption: ");
        scanf("%d", &shift);

        if (shift < 1 || shift > 25)
            printf("Bad input! Enter a value between 1 and 25.\n");
        else
            break;
    }

    printf("\nAfter removing non-alphabetical characters and capitalizing:\n");
    for (ci = 0, pi = 0; plain[pi] != '\0'; pi++)
    {
        if (isalpha(plain[pi]))
        {
            putchar(toupper(plain[pi]));
            cipher[ci++] = ((toupper(plain[pi]) - 'A') + shift % 26) % 26 + 'A';
        }
    }
    cipher[ci] = '\0';
    printf("\n\nAfter encryption:\n%s\n", cipher);

    // Decryption
    while (1)
    {
        printf("\nKey for decryption: ");
        scanf("%d", &shift);

        if (shift < 1 || shift > 25)
            printf("Bad input! Enter a value between 1 and 25.\n");
        else
            break;
    }

    for (pi = 0, ci = 0; cipher[ci] != '\0'; ci++)
    {
        plain[pi++] = ((cipher[ci] - 'A') + (26 - shift)) % 26 + 'A';
    }
    plain[pi] = '\0';
    printf("\nAfter decryption:\n%s\n", plain);

    return 0;
}
