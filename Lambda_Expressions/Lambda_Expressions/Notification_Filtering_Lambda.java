// Notification_Filtering_Lambda.java

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class Notification_Filtering_Lambda {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient heart rate abnormal!"),
            new Alert("Medication", "Time to take blood pressure pill."),
            new Alert("Appointment", "Doctor visit scheduled for tomorrow."),
            new Alert("General", "New health tips available in the app.")
        );

        System.out.println("=== All Alerts ===");
        alerts.forEach(System.out::println);

        // ✅ Filter only Critical alerts (lambda + Predicate)
        System.out.println("\n=== Critical Alerts Only ===");
        alerts.stream()
              .filter(a -> a.type.equals("Critical"))
              .forEach(System.out::println);

        // ✅ Filter only Medication alerts
        System.out.println("\n=== Medication Alerts Only ===");
        alerts.stream()
              .filter(a -> a.type.equals("Medication"))
              .forEach(System.out::println);

        // ✅ Filter Alerts containing "Patient"
        System.out.println("\n=== Alerts containing 'Patient' ===");
        alerts.stream()
              .filter(a -> a.message.contains("Patient"))
              .forEach(System.out::println);
    }
}
