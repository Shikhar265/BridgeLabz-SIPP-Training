import java.util.*;
class Array_Index
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.print("Enter index to access name: ");
        int index = sc.nextInt();

        System.out.println("\nCalling method that generates ArrayIndexOutOfBoundsException:");
        generateException(names, index);

        System.out.println("\nCalling method that handles ArrayIndexOutOfBoundsException:");
        handleException(names, index);
    }

    public static void generateException(String[] arr, int index) 
    {
        System.out.println("Accessed name: " + arr[index]);
    }

    public static void handleException(String[] arr, int index) 
    {
        try 
        {
            System.out.println("Accessed name: " + arr[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("ArrayIndexOutOfBoundsException caught.");
        } 
        catch (RuntimeException e) 
        {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}
