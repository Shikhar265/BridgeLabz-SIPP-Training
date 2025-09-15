import java.util.*;
import java.util.stream.Collectors;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount   = amount;
    }

    String getCustomer() {
        return customer;
    }

    double getAmount() {
        return amount;
    }
}

public class Order_Revenue_Summary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of orders
        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<Order> orders = new ArrayList<>();

        // Take order input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter customer name for order " + (i + 1) + ": ");
            String customer = sc.nextLine();

            System.out.print("Enter order amount for " + customer + ": ");
            double amount = sc.nextDouble();
            sc.nextLine(); // consume newline

            orders.add(new Order(customer, amount));
        }

        // Summing revenue per customer
        Map<String, Double> revenueSummary = orders.stream()
            .collect(Collectors.groupingBy(
                Order::getCustomer,
                Collectors.summingDouble(Order::getAmount)
            ));

        // Display result
        System.out.println("\nOrder Revenue Summary:");
        revenueSummary.forEach((customer, total) ->
            System.out.println(customer + " -> " + total)
        );

        sc.close();
    }
}
