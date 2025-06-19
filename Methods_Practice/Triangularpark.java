import java.util.*;

public class TriangleRunCalculator {

    // Method to calculate number of rounds needed for 5 km run
    public int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000.0; // in meters

        // Calculate how many full rounds are needed (rounding up to next whole round)
        int rounds = (int) Math.ceil(totalDistance / perimeter);
        return rounds;
    }

    public static void main(String[] args) {
        TriangleRunCalculator calculator = new TriangleRunCalculator();
        Scanner sc = new Scanner(System.in);

        // User input for triangle sides
        System.out.print("Enter length of side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter length of side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter length of side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate rounds
        int requiredRounds = calculator.calculateRounds(side1, side2, side3);

        // Output
        System.out.println("The athlete must complete " + requiredRounds + " rounds to cover 5 km.");
    }
}
