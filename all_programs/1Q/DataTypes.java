/**
 * 1B) Program to illustrate Data Types and Variables
 */

public class DataTypes
{
    public static void main(String args[])
    {
        byte b1 = 2, b2 =3;
        int b3 = b1 + b2; //will compile
        System.out.println("Addition of 2 bytes as int dtype, Result : " + b3);
        int c = 66;
        System.out.println("Character at ASCII Value :" + c + "is " + (char)c );
        float f = 4.28f;
        System.out.println("Suffix F or f should be given for a float var " + f);
        double d = 1e45;
        System.out.println("Double variable :" + d);
    }
}
