import java.util.*;
class Countdown_W 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int count = sc.nextInt();
        while (count >= 1) 
	{
            System.out.println(count);
            count--;
        }
        System.out.println("Rocket Launched!");
    }
}
