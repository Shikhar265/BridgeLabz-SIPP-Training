package Workshop;

import java.util.*;

//Order interface - Abstraction
interface Order {
 void process();
}

//OnlineOrder - Polymorphic behavior
class OnlineOrder implements Order {
 private String product;
 private String address;

 public OnlineOrder(String product, String address) {
     this.product = product;
     this.address = address;
 }

 @Override
 public void process() {
     System.out.println("[OnlineOrder] Processing online order for: " + product);
     System.out.println("Shipping to: " + address + "\n");
 }
}

//OfflineOrder - Polymorphic behavior
class OfflineOrder implements Order {
 private String product;
 private String storeLocation;

 public OfflineOrder(String product, String storeLocation) {
     this.product = product;
     this.storeLocation = storeLocation;
 }

 @Override
 public void process() {
     System.out.println("[OfflineOrder] Processing offline order for: " + product);
     System.out.println("Store pickup at: " + storeLocation + "\n");
 }
}

//SubscriptionOrder - Polymorphic behavior
class SubscriptionOrder implements Order {
 private String service;
 private int months;

 public SubscriptionOrder(String service, int months) {
     this.service = service;
     this.months = months;
 }

 @Override
 public void process() {
     System.out.println("[SubscriptionOrder] Processing subscription for: " + service);
     System.out.println("Duration: " + months + " month(s)\n");
 }
}

//Encapsulated Order Manager using LinkedList
class OrderManager {
 private LinkedList<Order> queue = new LinkedList<>();

 public void addOrder(Order order) {
     queue.addLast(order);
     System.out.println("Order added to queue.\n");
 }

 public void processAllOrders() {
     System.out.println("\n=== Processing All Orders ===");
     while (!queue.isEmpty()) {
         queue.poll().process(); // FIFO + Polymorphic
     }
     System.out.println("All orders processed.\n");
 }
}

//Main class
public class Order_Processing_System {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     OrderManager manager = new OrderManager();

     while (true) {
         System.out.println("=== Order Processing System ===");
         System.out.println("1. Add Online Order");
         System.out.println("2. Add Offline Order");
         System.out.println("3. Add Subscription Order");
         System.out.println("4. Process All Orders");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         int ch = sc.nextInt();
         sc.nextLine(); // clear newline

         switch (ch) {
             case 1 -> {
                 System.out.print("Enter product name: ");
                 String prod = sc.nextLine();
                 System.out.print("Enter shipping address: ");
                 String addr = sc.nextLine();
                 manager.addOrder(new OnlineOrder(prod, addr));
             }
             case 2 -> {
                 System.out.print("Enter product name: ");
                 String prod = sc.nextLine();
                 System.out.print("Enter store location: ");
                 String loc = sc.nextLine();
                 manager.addOrder(new OfflineOrder(prod, loc));
             }
             case 3 -> {
                 System.out.print("Enter service name: ");
                 String serv = sc.nextLine();
                 System.out.print("Enter subscription months: ");
                 int months = sc.nextInt();
                 sc.nextLine(); // clear newline
                 manager.addOrder(new SubscriptionOrder(serv, months));
             }
             case 4 -> manager.processAllOrders();
             case 5 -> {
                 System.out.println("Exiting system.");
                 sc.close();
                 return;
             }
             default -> System.out.println("Invalid choice.\n");
         }
     }
 }
}
