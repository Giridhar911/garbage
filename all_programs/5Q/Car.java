/**
5) Write a java program to create a program to superclass Motor Vehicle with instance
variable model Name, model Number, model Price, parameterized constructor, and display
() method. Create a sub-class that inherits the features of the superclass and has its instance
variable discountRate, parameterized constructor, and display (), discount () methods.
Create an object for the car class and invoke all the methods using the object of that class.
(Hint: Single Inheritance)
 */
class MotorVehicle
{
    String modelName;
    int modelNumber;
    float modelPrice;
    
    MotorVehicle(String mname, int mnumber, float mprice)
    {
        modelName = mname;
        modelNumber = mnumber;
        modelPrice = mprice;
    }
    
    void display()
    {
        System.out.println("Model Name is : " + modelName);
        System.out.println("Model Number is : " + modelNumber);
        System.out.println("Model Price is : " + modelPrice);
    }
}
public class Car extends MotorVehicle
{
    int discountRate;
    
    Car(String mname, int mnumber, float mprice, int dr)
    {
        super(mname, mnumber, mprice); //using super to inherit the above values
        discountRate = dr;
    }
    
    void display()
    {
        super.display();
        System.out.println("The discount rate is : " + discountRate);
    }
    
    void discount()
    {
        float discount = modelPrice * discountRate / 100;
        float priceAfterDiscount = modelPrice - discount;
        System.out.println("The discount is : " + discount);
        System.out.println("The price after discount is : " + priceAfterDiscount);
    }
    
    public static void main(String args[])
    {
        Car merc = new Car("Merc G Class", 200, 20000000, 20);
        merc.display();
        merc.discount();
    }
}
