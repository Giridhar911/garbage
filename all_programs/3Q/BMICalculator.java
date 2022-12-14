/**
3A) Write a program to create a BMI calculator that reads the user’s weight in kilograms
and height in meters, then calculates and displays the user’s body mass index. Formula: BMI
= weight (kg) / [height(m)]2
[Reference Values: Underweight: less than 18.5, Normal: between 18.5 and 24.9,
Overweight: between 25 and 29.9, Obese: 30 or greater]
 */
import java.util.*;
public class BMICalculator
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double weight,height,bmi;
        
        System.out.println("Input your Weight in Kg's: ");
        weight = input.nextDouble();
        
        System.out.println("Input your Height in Ft: ");
        height = 0.3048 * input.nextDouble();
        
        bmi = calcBMI(weight, height);
        
        System.out.println("Your BMI is: \n" + bmi);
        printBMITable();
    }
    
    //Calculate the bmi
    private static double calcBMI(double weight, double height)
    {
        return weight / (height*height);
    }
    
    //printBMITable method()
    private static void printBMITable()
    {
        System.out.println("\n BMI VALUES REFERENCE CHART");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");
    }
}
