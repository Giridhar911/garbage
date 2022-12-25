/**
8) Write a program to demonstrate the function on string like to Lower Case(), to Upper
Case(), length(), startsWith(), endsWith(),substring(), and string conversion using String.
Value Of()
 */
public class StringDemo
{
    public static void main(String args[])
    {
        String s1 = "Java Programming";
        System.out.println("String in Lower Case is : " + s1.toLowerCase());
        System.out.println("String in Upper Case is : " + s1.toUpperCase());
        System.out.println("The Length of the String is : " + s1.length());
        System.out.println("The String starts with j : " + s1.startsWith("j"));
        System.out.println("The String ends with G : " + s1.endsWith("G"));
        System.out.println("The SubString starting from index 3 is : " + s1.substring(3));
        System.out.println("The SubString starting fro index 3 till 6 is : " + s1.substring(3,6));
        
        //coverting boolean to string
        boolean b = true;
        String s2 = String.valueOf(b);
        System.out.println("The converted String is : " + s2);
        
        //converting char to string
        char c = 'a';
        s2 = String.valueOf(c);
        System.out.println("The converted String is : " + s2);
        
        //converting double to string
        double d = 2.4d;
        s2 = String.valueOf(d);
        System.out.println("The converted String is : " + s2);
        
        //converting int to string
        int i = 69;
        s2 = String.valueOf(i);
        System.out.println("The converted String is : " + s2);
    }
}
