
import java.util.Scanner;
import java.util.function.Predicate;

public class Temperature_Alert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 Taking threshold from user
        System.out.print("Enter temperature threshold: ");
        double threshold = sc.nextDouble();

        // 🔹 Creating Predicate to check if temperature crosses threshold
        Predicate<Double> isHighTemp = temp -> temp > threshold;

        // 🔹 Taking current temperature from user
        System.out.print("Enter current temperature: ");
        double currentTemp = sc.nextDouble();

        // 🔹 Checking condition
        if (isHighTemp.test(currentTemp)) {
            System.out.println("⚠️ ALERT: Temperature " + currentTemp + "°C exceeds threshold " + threshold + "°C!");
        } else {
            System.out.println("✅ Safe: Temperature " + currentTemp + "°C is within limit.");
        }

        sc.close();
    }
}
