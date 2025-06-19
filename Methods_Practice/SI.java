import java.util.*;

public class SimpleInterestCalculator {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input principal
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        // Input rate
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        // Input time
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculate simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Output result
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time);
    }
}
