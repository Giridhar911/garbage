/**
4C) Write a java program to demonstrate function overloading and overriding
    TestLoad (This Program) - Demonstrates Function Overloading
    TestRide (The Other Program) - Demonstrates Function Overriding
 */
class A
{
    public void p(double i)
    {
        System.out.println(i*2);
    }
}
class B extends A
{
    public void p(int i)
    {
        System.out.println(i);
    }
}
public class TestLoad
{
    public static void main(String args[])
    {
        A a = new A();
        a.p(10); //Parent Class Accessing parent class method
        B b = new B();
        b.p(10); //Child Class Accessing child class method
        b.p(10.0); //parent class method is accessed 
                    // instead of child class as specified dtype is double
    }
}

/**
 * Output :
 * 20.0
    10
    20.0
 */
