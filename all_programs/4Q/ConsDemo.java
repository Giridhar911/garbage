/** ACTUAL
4B) Write a java program to demonstrate copy constructor and constructor overloading.
 */
public class ConsDemo
{
    int m;
    String n;
    public ConsDemo(int m , String n) // parameterized constructor
    {
        this.m = m;
        this.n = n;
    }
    
    public ConsDemo(ConsDemo c)
    {
        this(c.getM(), c.getN());
    }
    
    int getM()
    {
        return m;
    }
    
    String getN()
    {
        return n;
    }
    
    void setM(int m)
    {
        this.m = m;
    }
    
    void setN(String n)
    {
        this.n = n;
    }
    
    public static void main(String args[])
    {
        ConsDemo c1 = new ConsDemo(13, "Original");
        ConsDemo c2 = new ConsDemo(c1);
        
        System.out.println("Object c1 : m = " + c1.getM() + "\nn = " + c1.getN());
        System.out.println("---------------------------------------------------");
        System.out.println("Object c2 : m = " + c2.getM() + "\nn = " + c2.getN());
        System.out.println("---------------------------------------------------");
        c2.setN("Updated Copy");
        System.out.println("Updated copy has been set");
        System.out.println("Object c2 : m = " + c2.getM() + "\nn = " + c2.getN());
        System.out.println("---------------------------------------------------");
    }
}
