

import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    List<String> availableDays; // e.g. ["Monday", "Saturday"]

    Doctor(String name, String specialty, List<String> availableDays) {
        this.name = name;
        this.specialty = specialty;
        this.availableDays = availableDays;
    }

    @Override
    public String toString() {
        return name + " | Specialty: " + specialty + " | Days: " + availableDays;
    }
}

public class Doctor_Availability {
    public static void main(String[] args) {
        // Sample doctors
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Mehta", "Cardiologist", Arrays.asList("Monday", "Wednesday", "Saturday")),
            new Doctor("Dr. Sharma", "Dermatologist", Arrays.asList("Tuesday", "Thursday")),
            new Doctor("Dr. Rao", "Neurologist", Arrays.asList("Friday", "Sunday")),
            new Doctor("Dr. Patel", "Orthopedic", Arrays.asList("Saturday", "Sunday")),
            new Doctor("Dr. Gupta", "Pediatrician", Arrays.asList("Monday", "Saturday"))
        );

        System.out.println("=== Doctors Available on Weekends ===");

        doctors.stream()
            .filter(d -> d.availableDays.contains("Saturday") || d.availableDays.contains("Sunday")) // ✅ weekend filter
            .sorted(Comparator.comparing(d -> d.specialty)) // ✅ sort by specialty
            .forEach(System.out::println);
    }
}
