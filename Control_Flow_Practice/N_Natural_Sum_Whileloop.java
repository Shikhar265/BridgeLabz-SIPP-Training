import java.util.*;
class N_Sum {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) 
	{
            System.out.println("The number " + n + " is not a natural number.");
        } 
	else 
	{
            int sum = 0;
            int i = 1;
            while (i <= n) 
	    {
                sum += i;
                i++;
            }

            int sumF = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + sumF);

            if (sum == sumF) 
	    {
                System.out.println("Both computations are correct.");
            } 
	    else 
	    {
                System.out.println("There is a mismatch in the results.");
            }
        }
    }
}
