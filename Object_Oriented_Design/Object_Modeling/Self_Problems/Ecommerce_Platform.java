import java.util.*;

// Class representing a Product
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name + ", Price: ₹" + price);
    }
}

// Class representing an Order
class Order {
    int orderId;
    ArrayList<Product> productList;

    Order(int orderId) {
        this.orderId = orderId;
        this.productList = new ArrayList<>();
    }

    // Add a product to the order
    void addProduct(Product p) {
        productList.add(p);
    }

    // Display order details
    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Product p : productList) {
            p.display();
            total += p.price;
        }
        System.out.println("Total Amount: ₹" + total + "\n");
    }
}

// Class representing a Customer
class Customer {
    String name;
    ArrayList<Order> orders;

    Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Customer places an order
    void placeOrder(Order order) {
        orders.add(order);
        System.out.println("Customer " + name + " placed Order ID: " + order.orderId);
    }

    // Display all orders for this customer
    void viewOrders() {
        System.out.println("\nOrders for Customer: " + name);
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

// Main class to test the e-commerce platform
public class Ecommerce_Platform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Products
        ArrayList<Product> allProducts = new ArrayList<>();
        System.out.print("Enter number of products: ");
        int productCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < productCount; i++) {
            System.out.print("Enter product name: ");
            String pname = sc.nextLine();
            System.out.print("Enter product price: ");
            double pprice = sc.nextDouble();
            sc.nextLine();
            allProducts.add(new Product(pname, pprice));
        }

        // Create Customer
        System.out.print("\nEnter customer name: ");
        String cname = sc.nextLine();
        Customer customer = new Customer(cname);

        // Create Orders
        System.out.print("Enter number of orders: ");
        int orderCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < orderCount; i++) {
            Order order = new Order(i + 1);
            System.out.println("Select products for Order ID " + (i + 1));
            for (int j = 0; j < allProducts.size(); j++) {
                System.out.println((j + 1) + ". " + allProducts.get(j).name + " (₹" + allProducts.get(j).price + ")");
            }
            System.out.print("Enter product numbers (comma-separated): ");
            String[] indices = sc.nextLine().split(",");
            for (String idx : indices) {
                int prodIndex = Integer.parseInt(idx.trim()) - 1;
                if (prodIndex >= 0 && prodIndex < allProducts.size()) {
                    order.addProduct(allProducts.get(prodIndex));
                }
            }
            customer.placeOrder(order);
        }

        customer.viewOrders();
    }
}
