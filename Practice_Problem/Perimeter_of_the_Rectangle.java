import java.util.*;
class Perimeter
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner (System.in);
	System.out.print("Length = ");
	int L=sc.nextInt();
	System.out.print("Breath = ");
	int B=sc.nextInt();
	Double P=2*(double)(L+B);
	System.out.print("Perimeter of a Rectangle = "+P);
    }
}