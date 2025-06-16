import java.util.*;
class Employee_Bonus 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        if (years > 5) 
	{
            double bonus = salary * 0.05;
	    salary=salary+bonus;
            System.out.println("The bonus amount is INR " + bonus);
	    System.out.println("The total amount is INR " + salary);
        } 
	else 
	{
            System.out.println("No bonus awarded.");
        }
    }
}
