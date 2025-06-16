import java.util.*;
class Divisible_5
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	if(n%5==0)
	{
	    System.out.println("Is the number " +n+ " Divisible by 5? Yes");
	}
	else
	{
	    System.out.println("Is the number " +n+ " Divisible by 5? No");
	}
    }
}