/**
6) Write a java program to create an abstract class Shape which contains the abstract
method number Of Sides(). Create different sub-classes by the name Trapezoid, Triangle, and
Hexagon, which extends the shape class. Develop a class Shape Demo which contains the
main method. Create the object for different subclasses with the main method and invoke
the method number Of Sides() using the objects of classes. (Hint: Abstract Class)
 */
abstract class Shape
{
    abstract void numberOfSides();
}

class Trapezoid extends Shape
{
    void numberOfSides()
    {
        System.out.println("The number of sides in a Trapezoid is 4");
    }
}

class Triangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("The number of sides in a Triangle is 3");
    }
}

class Hexagon extends Shape
{
    void numberOfSides()
    {
        System.out.println("The number of sides in a Hexagon is 6");
    }
}

public class ShapeDemo
{
    public static void main(String args[])
    {
        Trapezoid tp = new Trapezoid();
        tp.numberOfSides();
        Triangle tr = new Triangle();
        tr.numberOfSides();
        Hexagon he = new Hexagon();
        he.numberOfSides();
    }
}
