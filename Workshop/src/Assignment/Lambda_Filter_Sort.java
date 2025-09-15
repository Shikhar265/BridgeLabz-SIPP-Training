package Assignment;

import java.util.*;
import java.util.stream.Collectors;

class Service {
    String id;
    String type;
    int departMin; // minutes from now
    double fare;

    Service(String id, String type, int departMin, double fare) {
        this.id = id; this.type = type; this.departMin = departMin; this.fare = fare;
    }

    String toDisplay() {
        return id + "(" + type + ") departIn=" + departMin + "min fare=" + fare;
    }
}

public class Lambda_Filter_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Service> list = new ArrayList<>();

        System.out.print("Enter number of services: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            System.out.print("Service id: ");
            String id = sc.nextLine();
            System.out.print("Service type (Bus/Metro/Taxi): ");
            String type = sc.nextLine();
            System.out.print("Depart minutes from now: ");
            int depart = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Fare: ");
            double fare = Double.parseDouble(sc.nextLine().trim());
            list.add(new Service(id, type, depart, fare));
        }

        System.out.println("\nChoose filter: 1) Earliest departure  2) Lowest fare");
        String choice = sc.nextLine().trim();

        // Lambda used for filter and comparator
        List<Service> result;
        if ("1".equals(choice)) {
            result = list.stream()
                         .filter(s -> s.departMin <= 60) // lambda predicate
                         .sorted((a, b) -> Integer.compare(a.departMin, b.departMin)) // lambda comparator
                         .collect(Collectors.toList());
        } else {
            result = list.stream()
                         .filter(s -> s.fare <= 100) // lambda predicate
                         .sorted((a, b) -> Double.compare(a.fare, b.fare))
                         .collect(Collectors.toList());
        }

        System.out.println("\nFiltered & Sorted Services:");
        result.forEach(s -> System.out.println(s.toDisplay()));
        sc.close();
    }
}
