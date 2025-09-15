

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return name + " | Expiry: " + expiryDate;
    }
}

public class Gym_Membership_Expiry {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("Alice", LocalDate.now().plusDays(10)),
            new Member("Bob", LocalDate.now().plusDays(25)),
            new Member("Charlie", LocalDate.now().plusDays(40)),
            new Member("Daisy", LocalDate.now().plusDays(5)),
            new Member("Ethan", LocalDate.now().plusDays(60))
        );

        System.out.println("=== All Gym Members ===");
        members.forEach(System.out::println);

        LocalDate today = LocalDate.now();
        LocalDate cutoff = today.plusDays(30);

        System.out.println("\n=== Memberships expiring within 30 days ===");

        // 🔹 Filter members whose expiry is within 30 days
        members.stream()
            .filter(m -> !m.expiryDate.isBefore(today))      // not expired
            .filter(m -> !m.expiryDate.isAfter(cutoff))      // within 30 days
            .forEach(System.out::println);
    }
}
