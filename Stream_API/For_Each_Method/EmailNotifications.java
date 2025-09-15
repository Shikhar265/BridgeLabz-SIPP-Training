
import java.util.*;

public class EmailNotifications {

    // 🔹 Simulated email notification method
    public static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of emails
        System.out.print("Enter number of users: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<String> emails = new ArrayList<>();

        System.out.println("Enter " + n + " user emails:");
        for (int i = 0; i < n; i++) {
            emails.add(sc.nextLine());
        }

        System.out.println("\n=== Sending Notifications ===");

        // 🔹 Using forEach() with lambda
        emails.forEach(email -> sendEmailNotification(email));

        sc.close();
    }
}
