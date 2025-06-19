import java.util.*;

public class Main {

    // Corrected method signature to return a single double value
    public double calculateWindChill(double temp, double wspeed) {
        double windchill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wspeed, 0.16);
        return windchill;
    }

    public static void main(String[] args) {
        Main calculator = new Main();
        Scanner sc = new Scanner(System.in);

        // Input temperature
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temp = sc.nextDouble();

        // Input wind speed
        System.out.print("Enter wind speed (in mph): ");
        double wspeed = sc.nextDouble();

        // Call the method with correct variable names
        double result = calculator.calculateWindChill(temp, wspeed);

        // Display the result
        System.out.println("Wind Chill Temperature: " + result);
    }
}
