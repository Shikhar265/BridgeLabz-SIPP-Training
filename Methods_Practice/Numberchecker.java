public class NumberChecker {

    // Method to get the sum of proper divisors
    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum;
    }

    // 1. Perfect number
    public static boolean isPerfect(int num) {
        return num > 0 && sumOfProperDivisors(num) == num;
    }

    // 2. Abundant number
    public static boolean isAbundant(int num) {
        return num > 0 && sumOfProperDivisors(num) > num;
    }

    // 3. Deficient number
    public static boolean isDeficient(int num) {
        return num > 0 && sumOfProperDivisors(num) < num;
    }

    // 4. Strong number
    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == original;
    }

    // Helper method to compute factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    // Main method to test
    public static void main(String[] args) {
        int[] testNumbers = {6, 12, 15, 145}; // Sample inputs

        for (int num : testNumbers) {
            System.out.println("Checking number: " + num);
            System.out.println("Perfect Number? " + isPerfect(num));
            System.out.println("Abundant Number? " + isAbundant(num));
            System.out.println("Deficient Number? " + isDeficient(num));
            System.out.println("Strong Number? " + isStrong(num));
            System.out.println("---------------------------");
        }
    }
}
