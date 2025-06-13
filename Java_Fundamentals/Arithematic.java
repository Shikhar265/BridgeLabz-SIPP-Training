import java.util.*;
class ASDM
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	int add,sub;
	double mul,div;
	System.out.println("Enter the first number ");
	int num1=sc.nextInt();
	System.out.println("Enter the Second number ");	
	int num2=sc.nextInt();
	add=num1+num2;
	if(num1>num2)
	{
		sub=num1-num2;
	}
	else
	{
		sub=num2-num1;
	}
	mul=num1*num2;
	div=num1/num2;
	System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+num1+" and "+num2+" is "+add+","+sub+","+mul+","+div);
    }
}