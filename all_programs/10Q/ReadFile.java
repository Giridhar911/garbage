/**
10B) Write a java program to demonstrate working with files.
 */
import java.io.*;
import java.util.*;
public class ReadFile
{
    public static void main(String args[])
    {
        try
        {
            File myFile = new File("random.txt");
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch(Exception e)
        {
            System.out.println("File Not Found");
            e.printStackTrace();
        }
    }
}

/**
 * Output :
 * File Not Found
 * 
 * 69 Hello World 69
 */