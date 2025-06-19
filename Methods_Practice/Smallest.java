import java.util.*;

public class MinMaxFinder {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        // Check for smallest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Check for largest
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[] {smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 numbers
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Call method
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Output result
        System.out.println("Smallest number is: " + result[0]);
        System.out.println("Largest number is: " + result[1]);
    }
}
