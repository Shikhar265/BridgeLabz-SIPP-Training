import java.util.*;
class To_Fahrenheit
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner (System.in);
	System.out.print("Temperature in Celsius is ");
	int Celsius=sc.nextInt();
	int Fahrenheit=(Celsius*(9/5))+32;
	System.out.print("Temperature in Fahrenheit is "+ Fahrenheit);
    }
}