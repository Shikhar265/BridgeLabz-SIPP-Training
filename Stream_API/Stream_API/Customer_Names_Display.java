
import java.util.*;
import java.util.stream.*;

public class Customer_Names_Display {
    public static void main(String[] args) {
        // Sample list of customer names
        List<String> customers = Arrays.asList(
            "ravi", "Anita", "geeta", "Suresh", "manoj"
        );

        System.out.println("=== Original Customer Names ===");
        customers.forEach(System.out::println);

        System.out.println("\n=== Transformed & Sorted Names ===");

        // 🔹 Convert to uppercase and sort alphabetically
        customers.stream()
                 .map(String::toUpperCase)   // transform to uppercase
                 .sorted()                   // sort alphabetically
                 .forEach(System.out::println);
    }
}
