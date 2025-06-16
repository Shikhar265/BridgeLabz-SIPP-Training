import java.util.*;
class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num < 0) 
	{
            System.out.println("The number " + num + " is not a positive integer.");
        }
	else 
	{
            long fact = 1;
            for (int i = 1; i <= num; i++) 
	    {
                fact *= i;
            }
            System.out.println("The factorial of " + num + " is " + fact);
        }
    }
}
