import java.util.InputMismatchException;
import java.util.Scanner;

public class Unchecked_Exception
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        }
        finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}
