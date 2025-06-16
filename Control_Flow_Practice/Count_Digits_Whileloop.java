import java.util.*;
class Count_Digits 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int count = 0;
        if(num == 0) 
	{
            count = 1;
        } 
	else 
	{
            while(num != 0) 
	    {
                num /= 10;
                count++;
            }
        }
        System.out.println("Total digits: " + count);
    }
}
