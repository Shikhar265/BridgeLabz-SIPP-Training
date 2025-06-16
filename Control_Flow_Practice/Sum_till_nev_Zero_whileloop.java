import java.util.*;
class Sum_till_nev_Zero 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) 
	{
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();
            if (num <= 0)
	        { 
		        break;
	        }
            total += num;
        }
        System.out.println("Total sum is: " + total);
    }
}
