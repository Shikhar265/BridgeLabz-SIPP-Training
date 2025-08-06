import java.util.Scanner;

public class Nested_TryCatch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        try
        {
            int value = 0;

            try
            {
                value = arr[index]; // May throw ArrayIndexOutOfBoundsException
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Invalid array index!");
                return;
            }

            try
            {
                int result = value / divisor; // May throw ArithmeticException
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Cannot divide by zero!");
            }
        }
        finally
        {
            sc.close();
        }
    }
}
