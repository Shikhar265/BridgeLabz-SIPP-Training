
import java.util.*;
import java.time.LocalDateTime;

public class TransactionLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 Take number of transactions
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<String> transactionIds = new ArrayList<>();

        System.out.println("Enter " + n + " transaction IDs:");
        for (int i = 0; i < n; i++) {
            transactionIds.add(sc.nextLine());
        }

        System.out.println("\n=== Transaction Logs ===");

        // 🔹 Using forEach() with lambda to log transactions with timestamp
        transactionIds.forEach(id ->
            System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );

        sc.close();
    }
}
