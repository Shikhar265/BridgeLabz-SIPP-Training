import java.util.*;
class Factors 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num > 0) 
	{
            System.out.println("Factors of " + num + " are:");
            for (int i = 1; i < num; i++) 
	    {
                if (num % i == 0) 
		{
                    System.out.println(i);
                }
            }
        } 
	else 
	{
            System.out.println("Invalid input");
        }
    }
}
