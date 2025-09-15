
import java.util.*;
import java.util.stream.*;

public class StockPriceLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of stock prices
        System.out.print("Enter number of stock prices: ");
        int n = sc.nextInt();

        List<Double> prices = new ArrayList<>();

        // User inputs prices
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices.add(sc.nextDouble());
        }

        System.out.println("\n=== Live Stock Price Feed ===");

        // 🔹 Using forEach to log prices
        prices.forEach(price -> System.out.println("Price: " + price));

        sc.close();
    }
}
