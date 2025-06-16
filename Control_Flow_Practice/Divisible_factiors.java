import java.util.*;
class Divde_Factors 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num <= 0) 
	{
            System.out.println("The number " + num + " is not a positive integer.");
        }
        int i = 1;
        System.out.println("Factors of " + num + " are:");
        while (i <= num) 
	{
            if (num % i == 0) 
	    {
                System.out.println(i);
            }
            i++;
        }
    }
}
