import java.util.*;
class Power_Calculature 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int num = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
	int pow=power;
        int result = 1;
        while (power>0) 
	{
            result *= num;
            power--;
        }
        System.out.println("The result of " + num + " raised to the power " + pow + " is " + result);
    }
}
