package p1;
/**
9) Write a java program using the concept of packages. Create a class Trignometry
which contain static method sine (), cos (), tan (), cosec (), tan (), cosec (), sec (), 
 cot (). Print the value of a given angle in degree by calling these methods.
                     (Hint: Implementing packages)
*/

public class Trigonometry
{
    static float sine(double degrees)
    {
        double s;
        s = (Math.sin(Math.toRadians(degrees)));
        return (float)s;
    }
    
    static float cos(double degrees)
    {
        double s;
        s = (Math.cos(Math.toRadians(degrees)));
        return (float)s;
    }
    
    static float tan(double degrees)
    {
        double s;
        s = (Math.tan(Math.toRadians(degrees)));
        return (float)s;
    }
    
    static float cosec(double degrees)
    {
        double s;
        s = (Math.sin(Math.toRadians(degrees)));
        s = 1/s;
        return (float)s;
    }
    
    static float sec(double degrees)
    {
        double s;
        s = (Math.cos(Math.toRadians(degrees)));
        s = 1/s;
        return (float)s;
    }
    
    static float cot(double degrees)
    {
        double s;
        s = (Math.tan(Math.toRadians(degrees)));
        s = 1/s;
        return (float)s;
    }
    
    public static void main(String args[])
    {
        System.out.println("Sine value is : " + sine(30));
        System.out.println("Cos value is : " + cos(30));
        System.out.println("Tan value is : " + tan(30));
        System.out.println("Cosec value is : " + cosec(30));
        System.out.println("Sec value is : " + sec(30));
        System.out.println("Cot value is : " + cot(30));
    }
}
