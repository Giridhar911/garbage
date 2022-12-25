/**
2A) Write a program to find the zodiac sign for the entered date & month using a branching
    Statement.
 */
public class Zodiac
{
    public static void main (String args[])
    {
        int a,b;
        a = Integer.parseInt(args[0]); //Month
        b = Integer.parseInt(args[1]); //Date
        int z = 15;
        String z1[] = {"Capricorn","Aquarius","Pisces","Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius"};
        
        switch(a)
        {
            case 1:
                if(b < 20)
                {
                    z = 0;
                }
                else if(b > 19 && b <= 31)
                {
                    z = 1;
                }
                break;
            case 2:
                if(b < 18)
                {
                    z = 1;
                }
                else if (b > 17 && b < 30)
                {
                    z = 2;
                }
                break;
            case 3:
                if(b < 20 )
                {
                    z = 2;
                }
                else if (b > 19 && b < 31)
                {
                    z = 3;
                }
                break;
            case 4:
                if(b < 20)
                {
                    z = 3;
                }
                else if (b > 19 && b < 30)
                {
                    z = 4;
                }
                break;
            case 5:
                if(b < 21)
                {
                    z = 4;
                }
                else if (b > 20 && b < 31)
                {
                    z = 5;
                }
                break;
            case 6:
                if(b < 21)
                {
                    z = 5;
                }
                else if(b > 20 && b < 30)
                {
                    z = 6;
                }
                break;
            case 7:
                if(b < 23)
                {
                    z = 6;
                }
                else if(b > 22 && b < 31)
                {
                    z = 7;
                }
                break;
            case 8:
                if(b < 23)
                {
                    z = 7;
                }
                else if(b > 22 && b < 31)
                {
                    z = 8;
                }
                break;
            case 9:
                if(b < 23)
                {
                    z = 8;
                }
                else if(b > 22 && b < 30)
                {
                    z = 9;
                }
                break;
            case 10:
                if(b < 23)
                {
                    z = 9;
                }
                else if(b > 22 && b < 31)
                {
                    z = 10;
                }
                break;
            case 11:
                if(b < 22)
                {
                    z = 10;
                }
                else if(b > 21 && b < 30)
                {
                    z = 11;
                }
                break;
            case 12:
                if(b < 22)
                {
                    z = 11;
                }
                else if(b > 21 && b < 31)
                {
                    z = 0;
                }
                break;
            default:
                System.out.println("Month is not valid");
        }
        if((z >=0 ) && (z <= 11))
        {
            System.out.println("Zodiac sign is: " + z1[z]);
        }
        else
        {
            System.out.println("Date is not valid");
        }
    }
}
