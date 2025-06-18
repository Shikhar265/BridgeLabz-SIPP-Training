import java.util.*;
class Null_Pointer
{
    public static void main(String[] args) 
    {
	Scanner sc=new Scanner(System.in);

        System.out.println("Calling method that generates NullPointerException:");
        generateException();

        System.out.println("\nCalling method that handles NullPointerException:");
        handleException();
    }

    public static void generateException() 
    {
        String text = null;
        int len = text.length();
        System.out.println("Length: " + len);
    }

    public static void handleException() 
    {
        try 
        {
            String text = null;
            int len = text.length();
            System.out.println("Length: " + len);
        } 
        catch (NullPointerException e) 
        {
            System.out.println("NullPointerException caught.");
        } 
        catch (RuntimeException e) 
        {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}
