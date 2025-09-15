package Assignment;

import java.util.*;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

class Trip {
    String route;
    double fare;
    int departHour; // 0-23

    Trip(String route, double fare, int departHour) { this.route = route; this.fare = fare; this.departHour = departHour; }
    String getRoute() { return route; }
    double getFare() { return fare; }
    int getDepartHour() { return departHour; }
}

public class Collectors_Examples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Trip> trips = new ArrayList<>();

        System.out.print("Enter number of trips: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Route id: ");
            String route = sc.nextLine();
            System.out.print("Fare: ");
            double fare = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Depart hour (0-23): ");
            int h = Integer.parseInt(sc.nextLine().trim());
            trips.add(new Trip(route, fare, h));
        }

        // groupingBy: total fare per route
        Map<String, Double> totalFarePerRoute = trips.stream()
            .collect(Collectors.groupingBy(Trip::getRoute, Collectors.summingDouble(Trip::getFare)));

        System.out.println("\nTotal fare per route:");
        totalFarePerRoute.forEach((r, s) -> System.out.println(r + " -> " + s));

        // partitioningBy: peak (7-10 & 17-20) vs non-peak
        Map<Boolean, List<Trip>> partitioned = trips.stream()
            .collect(Collectors.partitioningBy(t -> isPeak(t.getDepartHour())));

        System.out.println("\nTrip counts: Peak vs Non-Peak");
        System.out.println("Peak -> " + partitioned.get(true).size());
        System.out.println("Non-Peak -> " + partitioned.get(false).size());

        // summarizingDouble: fare stats overall
        DoubleSummaryStatistics fareStats = trips.stream()
            .collect(Collectors.summarizingDouble(Trip::getFare));
        System.out.println("\nFare statistics:");
        System.out.println("Total = " + fareStats.getSum());
        System.out.println("Average = " + fareStats.getAverage());
        System.out.println("Max = " + fareStats.getMax());

        sc.close();
    }

    static boolean isPeak(int hour) {
        return (hour >= 7 && hour <= 10) || (hour >= 17 && hour <= 20);
    }
}
