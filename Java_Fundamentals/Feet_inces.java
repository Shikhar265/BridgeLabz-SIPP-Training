import java.util.*;
class Feet_Inch
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter the height in centimeter = ");
	double height=sc.nextDouble();
	double feet=height/30.48;
	double inch=height/2.54;
	System.out.print("Your Height in cm is "+height+" cm while in feet is "+feet+" feets and inches is "+inch+" inch");
    }
}
	