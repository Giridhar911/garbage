/**
10A) Write a java class to demonstrate Arithematic Exception, Null Pointer Exception,
    Array Index Out Of Bounds Exception.
              (Hint: Handling predefined exceptions)
 */
public class ExceptionsDemo
{
    public static void main(String args[])
    {
        try
        {
            int num1 = 30; // num2 = 0; 
            int num2 = 2;
            int output = num1 / num2;
            System.out.println("Result : " + output);
            
            int a[] = new int[10];
            //a[11] = 9; 
            a[1] = 9;
            System.out.println("Result : " + a[1]);
            
            //String str = null; 
            String str = "Hello";
            System.out.println(str.length());
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

/**
 * Output :
 * java.lang.ArithmeticException: / by zero
   Result : 15
   java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 10
   Result : 15
   Result : 9
   java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
   Result : 15
   Result : 9
   5
 */
