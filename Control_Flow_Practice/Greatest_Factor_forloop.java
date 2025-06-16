import java.util.*;
class Greatest_Factor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = num - 1; i >= 1; i--) 
	{
            if (num % i == 0) 
	    {
                fact = i;
                break;
            }
        }
        System.out.println("The greatest factor of " + num + " besides itself is: " + fact);
    }
}
