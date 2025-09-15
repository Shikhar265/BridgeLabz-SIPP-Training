package Assignment;

import java.util.*;
import java.util.concurrent.TimeUnit;

class Schedule {
    String id; int departMin; String type;
    Schedule(String id, String type, int departMin) { this.id = id; this.type = type; this.departMin = departMin; }
    String label() { return id + "(" + type + ") departs in " + departMin + "min"; }
}

public class ForEach_Display_Schedules {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Schedule> list = new ArrayList<>();

        System.out.print("Enter number of schedules: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Schedule id: ");
            String id = sc.nextLine();
            System.out.print("Type: ");
            String type = sc.nextLine();
            System.out.print("Depart minutes: ");
            int dm = Integer.parseInt(sc.nextLine().trim());
            list.add(new Schedule(id, type, dm));
        }

        System.out.println("\nLive Dashboard (one pass):");
        // forEach used to display
        list.forEach(s -> System.out.println(s.label()));

        sc.close();
    }
}
