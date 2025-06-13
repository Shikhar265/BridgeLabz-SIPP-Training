import java.util.*;
class S_Interest
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner (System.in);
	System.out.print("Principle = ");
	int P=sc.nextInt();
	System.out.print("Rate = ");
	int R=sc.nextInt();
	System.out.print("Time = ");
	int T=sc.nextInt();
	double SI=(P*R*T)/100;
	System.out.print("Simple Interest = "+SI);
    }
}