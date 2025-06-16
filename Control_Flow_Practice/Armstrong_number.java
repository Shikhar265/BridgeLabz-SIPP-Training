import java.util.*;
class Armstrong_Number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), original = num, sum = 0;
        while(original != 0) 
	{
            int digit = original % 10;
            sum += digit * digit * digit;
            original /= 10;
        }
        if(sum == num) 
	{
	    System.out.println(num + " is an Armstrong Number");
	}
        else 
	{
	    System.out.println(num + " is Not an Armstrong Number");
	}
    }
}
