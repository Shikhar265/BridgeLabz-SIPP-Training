// Invoice_Object_Creation.java

import java.util.*;
import java.util.stream.*;

class Invoice {
    private String transactionId;

    // 🔹 Constructor
    public Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice{TransactionID='" + transactionId + "'}";
    }
}

public class Invoice_Object_Creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 User se transaction count lena
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine(); // buffer clear

        List<String> transactionIDs = new ArrayList<>();

        // 🔹 User se transaction IDs lena
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Transaction ID " + i + ": ");
            transactionIDs.add(sc.nextLine());
        }

        // 🔹 Constructor reference (Invoice::new) to create Invoice objects
        List<Invoice> invoices = transactionIDs.stream()
                                               .map(Invoice::new)
                                               .collect(Collectors.toList());

        System.out.println("\n=== Generated Invoice Objects ===");
        invoices.forEach(System.out::println);

        sc.close();
    }
}
