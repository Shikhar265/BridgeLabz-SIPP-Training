import java.util.*;
class Harshad_Number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number: ");
        int num = sc.nextInt();
	int temp = num, sum = 0;
        while(temp != 0) 
	{
            sum += temp % 10;
            temp /= 10;
        }
        if(num % sum == 0) 
	{
	    System.out.println(num + " is a Harshad Number");
	}
        else 
	{
	    System.out.println(num + " is Not a Harshad Number");
	}
    }
}
