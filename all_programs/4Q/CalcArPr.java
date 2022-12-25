/**
4A) Write a java program to find the area and perimeter of a rectangle using the concept of
    class and objects.
 */
public class CalcArPr
{
    public static void main(String args[])
    {
        Rectangle rr = new Rectangle();
        rr.setL(10);
        rr.setW(20);
        System.out.println("Perimeter = " + rr.perimeter());
        System.out.println("Area = " + rr.area());
    }
}
class Rectangle
{
    int L , W;
    Rectangle()
    {
        L = 1;
        W = 1;
    }
    
    void setL(int a)
    {
        L = a;
    }
    
    void setW(int a)
    {
        W = a;
    }
    
    int getL()
    {
        return L;
    }
    
    int getW()
    {
        return W;
    }
    
    int perimeter()
    {
        int pr;
        pr = 2*(getL() + getW());
        return pr;
    }
    
    int area()
    {
        int ar;
        ar = getL() * getW();
        return ar;
    }
}

