import java.util.Scanner;
class Double_Operations
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter value for a: ");
	double a=sc.nextDouble();
	System.out.print("Enter value for b: ");
	double b=sc.nextDouble();
	System.out.print("Enter value for c: ");
	double c=sc.nextDouble();
	double op1=a+b*c;
	double op2=a*b+c;
	double op3=c+a/b;
	double op4=a%b+c;
	System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f",op1,op2,op3,op4);
    }
}
