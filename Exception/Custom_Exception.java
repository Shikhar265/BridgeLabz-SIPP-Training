import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
}

public class Custom_Exception
{
    // Method to validate age
    static void validateAge(int age) throws InvalidAgeException
    {
        if (age < 18)
        {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            validateAge(age);
            System.out.println("Access granted!");
        }
        catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
        }
        finally
        {
            sc.close();
        }
    }
}
