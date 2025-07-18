package Workshop;

import java.util.*;

//Interface – Abstraction
interface Notification {
 void deliver();  // Each notification implements its own delivery
}

//Email Notification – Polymorphism
class EmailNotification implements Notification {
 private String to;
 private String subject;

 public EmailNotification(String to, String subject) {
     this.to = to;
     this.subject = subject;
 }

 @Override
 public void deliver() {
     System.out.println("[Email] Sent to: " + to + ", Subject: " + subject);
 }
}

//SMS Notification – Polymorphism
class SMSNotification implements Notification {
 private String phone;
 private String message;

 public SMSNotification(String phone, String message) {
     this.phone = phone;
     this.message = message;
 }

 @Override
 public void deliver() {
     System.out.println("[SMS] Sent to: " + phone + ", Message: " + message);
 }
}

//Push Notification – Polymorphism
class PushNotification implements Notification {
 private String deviceId;
 private String alert;

 public PushNotification(String deviceId, String alert) {
     this.deviceId = deviceId;
     this.alert = alert;
 }

 @Override
 public void deliver() {
     System.out.println("[Push] Sent to Device ID: " + deviceId + ", Alert: " + alert);
 }
}

//Encapsulated Queue – Internal structure hidden
class NotificationQueue {
 private LinkedList<Notification> queue = new LinkedList<>();

 // Abstraction: exposed method
 public void add(Notification notification) {
     queue.add(notification);
     System.out.println("Notification added to queue.\n");
 }

 // Abstraction: exposed method
 public void sendAll() {
     System.out.println("\n=== Sending All Notifications ===");
     while (!queue.isEmpty()) {
         Notification n = queue.poll();  // FIFO
         n.deliver();  // Polymorphism
     }
     System.out.println("All notifications delivered.\n");
 }
}

//Main App Class
public class Notification_System_App {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     NotificationQueue manager = new NotificationQueue();

     while (true) {
         System.out.println("=== Notification System ===");
         System.out.println("1. Add Email Notification");
         System.out.println("2. Add SMS Notification");
         System.out.println("3. Add Push Notification");
         System.out.println("4. Send All Notifications");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         int ch = sc.nextInt();
         sc.nextLine(); // Consume newline

         switch (ch) {
             case 1 -> {
                 System.out.print("Enter recipient email: ");
                 String to = sc.nextLine();
                 System.out.print("Enter subject: ");
                 String subject = sc.nextLine();
                 manager.add(new EmailNotification(to, subject));
             }
             case 2 -> {
                 System.out.print("Enter phone number: ");
                 String phone = sc.nextLine();
                 System.out.print("Enter message: ");
                 String message = sc.nextLine();
                 manager.add(new SMSNotification(phone, message));
             }
             case 3 -> {
                 System.out.print("Enter device ID: ");
                 String device = sc.nextLine();
                 System.out.print("Enter alert text: ");
                 String alert = sc.nextLine();
                 manager.add(new PushNotification(device, alert));
             }
             case 4 -> manager.sendAll();
             case 5 -> {
                 System.out.println("Exiting Notification System.");
                 sc.close();
                 return;
             }
             default -> System.out.println("Invalid choice.\n");
         }
     }
 }
}
