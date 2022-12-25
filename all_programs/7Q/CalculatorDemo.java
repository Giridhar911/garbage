/**
7) Write a program to create an interface Calculator which contains add(), sub(),
multiply(), divide(), remainder () abstract methods with two-parameter x and y. Develop a
class Calculator Demo which inherits the features of the interface. Create an object for the
Calculator Demo class and invoke all the methods of this class.
     (Hint: implementing interfaces / multiple inheritances)
 */
interface Calculator
{
    public int add(int x, int y);
    public int sub(int x, int y);
    public int multiply(int x, int y);
    public int divide(int x, int y);
    public int remainder(int x, int y);
}

public class CalculatorDemo implements Calculator
{
    public int add(int x, int y)
    {
        return(x + y);
    }
    public int sub(int x, int y)
    {
        return(x - y);
    }
    public int multiply(int x, int y)
    {
        return(x * y);
    }
    public int divide(int x, int y)
    {
        return(x / y);
    }
    public int remainder(int x, int y)
    {
        return(x % y);
    }
    
    public static void main(String args[])
    {
        CalculatorDemo cd = new CalculatorDemo();
        System.out.println("Sum of two no is : " + cd.add(10,10));
        System.out.println("Difference of two no is : " + cd.sub(1,10));
        System.out.println("Product of two no is : " + cd.multiply(10,10));
        System.out.println("Quotient of two no is : " + cd.divide(50,10));
        System.out.println("Remainder of two no is : " + cd.remainder(10,10));
    }
}
