
import java.util.*;

public class EventAttendeeWelcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of attendees
        System.out.print("Enter number of attendees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<String> attendees = new ArrayList<>();

        // User inputs attendee names
        System.out.println("Enter attendee names:");
        for (int i = 0; i < n; i++) {
            attendees.add(sc.nextLine());
        }

        System.out.println("\n=== Welcome Messages ===");

        // 🔹 Using forEach with Lambda
        attendees.forEach(name -> 
            System.out.println("Welcome, " + name + "! We’re glad to have you here.")
        );

        sc.close();
    }
}
