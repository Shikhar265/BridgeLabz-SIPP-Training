import java.util.*;
class Below_100 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int num = sc.nextInt();
        if (num > 0 && num < 100) 
	{
            int count = 100;
            while (count > 1) 
	    {
                if (count % num == 0) 
		{
                    System.out.println(count);
                }
                count--;
            }
        } 
	else 
	{
            System.out.println("Invalid input");
        }
    }
}
