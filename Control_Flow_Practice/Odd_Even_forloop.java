import java.util.*;
class Odd_Even 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();
        if (num <= 0) 
	{
            System.out.println("The number " + num + " is not a natural number.");
        }
        for (int i = 1; i <= num; i++) 
	{
            if (i % 2 == 0) 
	    {
                System.out.println(i + " is even");
            } 
	    else 
	    {
                System.out.println(i + " is odd");
            }
        }
    }
}
