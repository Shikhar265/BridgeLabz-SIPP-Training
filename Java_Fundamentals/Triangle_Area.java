import java.util.Scanner;
class Triangle_Area
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of base ");
	double base=sc.nextDouble();
	System.out.println("Enter the value of height ");
	double height=sc.nextDouble();
	double area_Cm=0.5*base*height;
	double area_In=area_Cm/(2.54*2.54);
	System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f",area_In,area_Cm);
    }
}
