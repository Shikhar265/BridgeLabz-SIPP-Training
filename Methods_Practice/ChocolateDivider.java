import java.util.*;

public class Main {

    // Method to calculate quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {quotient, remainder}; // index 0: chocolates per child, index 1: remaining
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        // Input: number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Guard against divide by zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
            return;
        }

        // Call method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Output
        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
