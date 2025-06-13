import java.util.*;
class Volume
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner (System.in);
	System.out.print("Radius of the Cylinder = ");
	int radius=sc.nextInt();
	System.out.print("Height of the Cylinder = ");
	int height=sc.nextInt();
	double volume=3.14*radius*radius*height;
	System.out.print("Volume of the Cylinder = "+volume);
    }
}