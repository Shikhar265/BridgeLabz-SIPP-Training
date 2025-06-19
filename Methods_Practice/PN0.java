import java.util.*;

public class NumberChecker {

    // Method to check the sign of a number
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call method
        int result = checkNumber(number);

        // Display result
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}
