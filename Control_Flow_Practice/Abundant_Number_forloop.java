import java.util.*;
class Abundant_Number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < num; i++) 
	{
            if(num % i == 0) 
	    {
                sum += i;
            }
        }
        if(sum > num) 
	{
            System.out.println(num + " is an Abundant Number");
        } 
	else 
	{
            System.out.println(num + " is Not an Abundant Number");
        }
    }
}
