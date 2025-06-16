import java.util.*;
class Odd_Even 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();
        if (num <= 0) 
	{
            System.out.println("Not a natural number");
        }
        int[] even = new int[num / 2 + 1];
        int[] odd = new int[num / 2 + 1];
        int evenIndex = 0, oddIndex = 0;
        for (int i = 1; i <= num; i++) 
	{
            if (i % 2 == 0) even[evenIndex++] = i;
            else odd[oddIndex++] = i;
        }
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) 
	{
            System.out.print(even[i] + " ");
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) 
	{
            System.out.print(odd[i] + " ");
        }
    }
}