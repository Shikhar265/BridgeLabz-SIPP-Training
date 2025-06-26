import java.util.*;

// Product class representing each item bought
class Product {
    String name;
    int quantity;
    double pricePerUnit;

    // Constructor to initialize product details
    Product(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Method to calculate total price for the product
    double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    // Display product details
    void displayProduct() {
        System.out.println(name + " (" + quantity + " x $" + pricePerUnit + ") = $" + getTotalPrice());
    }
}

// Customer class containing list of products purchased
class Customer {
    String name;
    ArrayList<Product> products;

    // Constructor to initialize customer name and product list
    Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Method to add product to customer cart
    void addProduct(Product product) {
        products.add(product);
    }
}

// BillGenerator class to calculate and display the bill
class BillGenerator {

    // Method to generate the total bill
    static double generateBill(Customer customer) {
        double total = 0;
        System.out.println("\n--- Bill for " + customer.name + " ---");
        for (Product p : customer.products) {
            p.displayProduct();
            total += p.getTotalPrice();
        }
        System.out.println("--------------------------");
        System.out.println("Total: $" + total);
        return total;
    }
}

// Main class
public class Grocery_Bill_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take customer name input
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();
        Customer customer = new Customer(customerName);

        // Take number of products
        System.out.print("Enter number of products: ");
        int count = sc.nextInt();
        sc.nextLine();

        // Loop to take each product input
        for (int i = 1; i <= count; i++) {
            System.out.println("\nEnter details for product " + i + ":");
            System.out.print("Product name: ");
            String name = sc.nextLine();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Price per unit: ");
            double price = sc.nextDouble();
            sc.nextLine();

            Product product = new Product(name, qty, price);
            customer.addProduct(product);
        }

        // Generate and display bill
        BillGenerator.generateBill(customer);
    }
}
