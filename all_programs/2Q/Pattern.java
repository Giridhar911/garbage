/**
2B) Write a program to create the following pattern using the looping structures
 */

public class Pattern 
{
    public static void main(String args[]) 
    {
        int i, j, k, l;
        for (i = 0; i < 7; i++) 
        {
            /* A for loop for printing blank spaces. First time 7 blank spaces will be printed and
            henceforth the number of spaces will reduce by 1 in every iteration */
            for (j = 7; j > i; j--)
            {
                System.out.print(" ");
            }
            /* ASCII value of A is taken and based value of i the loop is executed to print the
            alphabets. First time the only A will be printed as the value of i is 0. Second time AB
            will be printed by this loop and soon. */
            for (k = 65; k <= 65 + i; k++)
            {
                System.out.print((char)(k));
            }
            /*This loop prints the alphabets in reverse order*/
            for (l = k - 1; l > 65; l--)
            System.out.print((char)(l - 1));
            System.out.println();
        }
    }
}