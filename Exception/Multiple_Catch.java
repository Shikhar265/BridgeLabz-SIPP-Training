import java.util.Scanner;

public class Multiple_Catch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // You can toggle this to null to test NullPointerException
        int[] arr = {10, 20, 30, 40, 50};

        try
        {
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();

            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e)
        {
            System.out.println("Array is not initialized!");
        }
        finally
        {
            sc.close();
        }
    }
}
