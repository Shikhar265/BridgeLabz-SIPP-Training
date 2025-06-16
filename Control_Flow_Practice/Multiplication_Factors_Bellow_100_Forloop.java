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
            for (int i = 100; i >= 1; i--) 
	    {
                if (i % num == 0) 
		{
                    System.out.println("The Number That Could Divide "+num+" is: "+i);
                }
            }
        } 
	else 
	{
            System.out.println("Invalid input");
        }
    }
}
