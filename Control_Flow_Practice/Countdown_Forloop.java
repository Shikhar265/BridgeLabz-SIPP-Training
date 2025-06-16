import java.util.*;
class Countdown 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int count = sc.nextInt();
        for (int i = count; i >= 1; i--) 
	{
            System.out.println(i);
        }
        System.out.println("Rocket Launched!");
    }
}
