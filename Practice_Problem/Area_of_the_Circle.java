import java.util.*;
class Circles_Area
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner (System.in);
	System.out.print("Radius of a Circle = ");
	double radius=sc.nextDouble();
	double area=(22/7)*radius*radius;
	System.out.print("Area of the circle = "+area);
    }
}