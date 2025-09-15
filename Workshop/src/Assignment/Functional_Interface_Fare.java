package Assignment;

import java.util.*;

@FunctionalInterface
interface FareCalculator {
    double calculateFare(double base, double distanceKm);
}

public class Functional_Interface_Fare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base fare: ");
        double base = Double.parseDouble(sc.nextLine().trim());
        System.out.print("Enter distance (km): ");
        double km = Double.parseDouble(sc.nextLine().trim());

        // lambda implementation: base + per-km * km, with surge for peak
        FareCalculator calc = (b, d) -> {
            double perKm = 5.0;
            double fare = b + perKm * d;
            int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            if (hour >= 7 && hour <= 10) fare *= 1.2; // peak surge
            return fare;
        };

        double fare = calc.calculateFare(base, km);
        System.out.println("Calculated fare = " + fare);

        sc.close();
    }
}
