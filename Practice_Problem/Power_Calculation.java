import java.util.*;
class Power_Cal
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner (System.in);
	System.out.print("Base value = ");	
	int Base=sc.nextInt();
	System.out.print("Exponent value = ");	
	int Exp=sc.nextInt();
	Double Power=Math.pow(Base,Exp);
	System.out.print("Perimeter of a Rectangle = "+Power);
    }
}