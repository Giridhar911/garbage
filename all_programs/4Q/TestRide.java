/**
4C) Write a java program to demonstrate function overloading and overriding
    TestRide (This Program) - Demonstrates Function Overriding
    TestLoad (The Other Program) - Demonstrates Function Overloading
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
    public void p(double i)
    {
        System.out.println(i);
    }
}
public class TestRide
{
    public static void main(String args[])
    {
        A a = new A();
        a.p(10); //Parent Class Accessing parent class method
        B b = new B();
        b.p(10); //Child Class Accessing child class method
        b.p(10.0); // Child Class method is accessed , overrides parent class
    }
}

/**
 * Output :
 * 20.0
    10.0
    10.0
 */
