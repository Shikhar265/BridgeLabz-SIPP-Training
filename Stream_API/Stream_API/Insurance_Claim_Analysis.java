

import java.util.*;
import java.util.stream.*;
 
class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return type + " | Amount: " + amount;
    }
}

public class Insurance_Claim_Analysis {
    public static void main(String[] args) {
        // Sample claim data
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 5000),
            new Claim("Vehicle", 20000),
            new Claim("Health", 7000),
            new Claim("Property", 50000),
            new Claim("Vehicle", 15000),
            new Claim("Health", 6000)
        );

        System.out.println("=== Average Claim Amount by Type ===");

        // 🔹 Group by claim type and calculate average
        Map<String, Double> avgClaims = claims.stream()
            .collect(Collectors.groupingBy(
                c -> c.type,
                Collectors.averagingDouble(c -> c.amount)
            ));

        // Print result
        avgClaims.forEach((type, avg) -> 
            System.out.println(type + " → Avg: " + avg));
    }
}
