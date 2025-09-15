package Assignment;

import java.util.*;
import java.util.stream.Collectors;

class Passenger {
    String name;
    String route;

    Passenger(String name, String route) { this.name = name; this.route = route; }
    String getRoute() { return route; }
}

public class Stream_APIs_Group_Top {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Passenger> list = new ArrayList<>();

        System.out.print("Enter number of passengers: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Passenger name: ");
            String name = sc.nextLine();
            System.out.print("Route id: ");
            String route = sc.nextLine();
            list.add(new Passenger(name, route));
        }

        // Group by route and count
        Map<String, Long> byRoute = list.stream()
            .collect(Collectors.groupingBy(Passenger::getRoute, Collectors.counting()));

        System.out.println("\nPassengers per route:");
        byRoute.forEach((r, c) -> System.out.println(r + " -> " + c));

        // Find top-used route
        Optional<Map.Entry<String, Long>> top = byRoute.entrySet().stream()
            .max(Map.Entry.comparingByValue());

        System.out.println("\nTop route:");
        top.ifPresent(e -> System.out.println(e.getKey() + " with " + e.getValue() + " passengers"));

        sc.close();
    }
}
