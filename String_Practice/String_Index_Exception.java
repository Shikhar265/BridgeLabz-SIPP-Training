import java.util.*;
class String_Index
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter index to access character: ");
        int index = sc.nextInt();

        System.out.println("\nCalling method that generates StringIndexOutOfBoundsException:");
        generateException(text, index);

        System.out.println("\nCalling method that handles StringIndexOutOfBoundsException:");
        handleException(text, index);
    }

    public static void generateException(String str, int index) 
    {
        char ch = str.charAt(index);
        System.out.println("Character at index: " + ch);
    }

    public static void handleException(String str, int index) 
    {
        try 
        {
            char ch = str.charAt(index);
            System.out.println("Character at index: " + ch);
        } 
        catch (StringIndexOutOfBoundsException e) 
        {
            System.out.println("StringIndexOutOfBoundsException caught.");
        } 
        catch (RuntimeException e) 
        {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}
