import java.util.Scanner;
class Num_Swapp
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int a = sc.nextInt();
        System.out.print("Enter number2: ");
        int b = sc.nextInt();
        a=a+b;
	b=a-b;
	a=a-b;
        System.out.println("The swapped numbers are " + a + " and " + b);
    }
}
