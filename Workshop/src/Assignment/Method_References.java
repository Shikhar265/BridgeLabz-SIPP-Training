package Assignment;

import java.util.*;
import java.util.function.Function;

class FareUtils {
    static double applyBaseDiscount(double fare) {
        return fare * 0.9; // 10% discount
    }

    static void printLine(String s) {
        System.out.println(s);
    }
}

public class Method_References {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> fares = new ArrayList<>();

        System.out.print("How many fares to enter: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter fare: ");
            fares.add(Double.parseDouble(sc.nextLine().trim()));
        }

        // Use method reference for mapping fares through FareUtils::applyBaseDiscount
        List<Double> discounted = new ArrayList<>();
        fares.stream()
             .map(FareUtils::applyBaseDiscount) // method reference
             .forEach(discounted::add);         // method reference to list add

        System.out.println("\nDiscounted fares:");
        // Use method reference to print
        discounted.stream().map(Object::toString).forEach(FareUtils::printLine);

        sc.close();
    }
}
