import java.util.*;
class Illegal_Argument
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        System.out.println("\nCalling method that generates IllegalArgumentException:");
        generateException(text, start, end);

        System.out.println("\nCalling method that handles IllegalArgumentException:");
        handleException(text, start, end);
    }

    public static void generateException(String str, int start, int end) 
    {
        String sub = str.substring(start, end);
        System.out.println("Substring: " + sub);
    }

    public static void handleException(String str, int start, int end) 
    {
        try 
        {
            String sub = str.substring(start, end);
            System.out.println("Substring: " + sub);
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("IllegalArgumentException caught.");
        } 
        catch (RuntimeException e) 
        {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}
