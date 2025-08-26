

import java.util.Scanner;

// 🔹 Interface with static conversion methods
interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;   // 1 km = 0.621371 miles
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;    // 1 kg = 2.20462 pounds
    }
}

public class Unit_Conversion_Tool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Logistics Unit Conversion Tool ===");

        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        System.out.println(km + " km = " + UnitConverter.kmToMiles(km) + " miles");

        System.out.print("Enter weight in kilograms: ");
        double kg = sc.nextDouble();
        System.out.println(kg + " kg = " + UnitConverter.kgToLbs(kg) + " lbs");

        sc.close();
    }
}
