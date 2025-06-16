import java.util.*;
class Multipl_Table 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (form 6 to 9): ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) 
	{
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
