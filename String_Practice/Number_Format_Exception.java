import java.util.*;

class NumberFormatDemo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (as text): ");
        String input = sc.next();

        System.out.println("\nCalling method that generates NumberFormatException:");
        generateException(input);

        System.out.println("\nCalling method that handles NumberFormatException:");
        handleException(input);
    }

    public static void generateException(String text) 
    {
        int num = Integer.parseInt(text);
        System.out.println("Converted number: " + num);
    }

    public static void handleException(String text) 
    {
        try 
        {
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("NumberFormatException caught: Input is not a valid number.");
        } 
        catch (RuntimeException e) 
        {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}
