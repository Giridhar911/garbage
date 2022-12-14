/**
1C) Write a program to create three variables and find the number of distinct values using
    Branching statements.
 */
public class Distinct
{
    public static void main(String args[])
    {
        int a=1, b=3, c=2;
        if((a==b) && (a==c))
        {
            System.out.println("Number of distinct values are: 0");
        }
        else if((a==b) && (a!=c) || (a==c) && (a!=b) || (b==c))
        {
            System.out.println("Number of distinct values are: 2");
        }
        else
        {
            System.out.println("Number of distinct values are: 3"); 
        }
    }
}
