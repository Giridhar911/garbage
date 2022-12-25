/**
4B) Write a java program to demonstrate copy constructor and constructor overloading.
 */
public class Student_demo
{
    String name;
    int rno;
    
    public Student()
    {
        name = "Original Name";
        rno = 69;
    }
    
    public Student(String str, int n) //Parameterized Constructor
    {
        name = str;
        rno = n;
    }
    
    public Student(Student s1) //Copy Constructor
    {
        this.name = s1.name;
        this.rno = s1.rno;
    }
    
    String showN()
    {
        return name;
    }
    
    int showR()
    {
        return rno;
    }
    
    public static void main(String args[])
    {
        Student s = new Student();
        System.out.println("Default Constructor Student Name is : " + s.showN());
        System.out.println("Default Constructor Student Rno is : " + s.showR());
    }
}
