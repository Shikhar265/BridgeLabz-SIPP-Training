import java.util.*;
class Avg_Three
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner (System.in);
	System.out.print("First Number = ");
	int P=sc.nextInt();
	System.out.print("Second Number = ");
	int R=sc.nextInt();
	System.out.print("Third Number = ");
	int T=sc.nextInt();
	int Avg=(P+R+T)/3;
	System.out.print("Average of three number = "+Avg);
    }
}