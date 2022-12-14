/**
3B) Write a program to calculate the value of π from the infinite series
Print a table that shows the value of π approximated by computing the first 200,000 terms of
this series. How many terms do you have to use before you first get a value that begins with
3.14159?
 */
public class ValueOfPi
{
    private static final long TERMS = 200000;
    
    public static void main(String args[])
    {
        double infSeries = 0.0f;
        boolean sign = true;
        
        for(int i = 1; i <= TERMS; i+=2)
        {
            //only compute odd numbers
            if (i%2 == 0)
                continue;
                
            //check if addition or subtraction
            if(sign)
                infSeries += (4.0 / (double) i);
            else
                infSeries -= (4.0 / (double) i);
                //reverse the sign
                sign = (!sign);
        }
        System.out.printf("Pi Value is: %f", infSeries);
    }
}
