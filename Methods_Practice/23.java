import java.util.*;

public class NumberCheck {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        return Integer.compare(a, b); // returns 0, 1, -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            nums[i] = sc.nextInt();

            if (isPositive(nums[i])) {
                System.out.print("Positive and ");
                System.out.println(isEven(nums[i]) ? "Even" : "Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(nums[0], nums[4]);
        if (result == 0)
            System.out.println("First and Last numbers are equal");
        else if (result > 0)
            System.out.println("First number is greater than Last");
        else
            System.out.println("First number is less than Last");
    }
}
