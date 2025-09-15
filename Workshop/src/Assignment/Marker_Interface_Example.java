package Assignment;

import java.util.*;

interface EmergencyService {} // marker

interface Service {
    String getId();
    String getType();
}

class Ambulance implements Service, EmergencyService {
    String id;
    Ambulance(String id) { this.id = id; }
    public String getId() { return id; }
    public String getType() { return "Ambulance"; }
}

class Taxi implements Service {
    String id;
    Taxi(String id) { this.id = id; }
    public String getId() { return id; }
    public String getType() { return "Taxi"; }
}

public class Marker_Interface_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Service> list = new ArrayList<>();

        System.out.print("Enter number of services: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Type (ambulance/taxi) and id: ");
            String[] parts = sc.nextLine().split("\\s+");
            String t = parts[0], id = parts[1];
            if ("ambulance".equalsIgnoreCase(t)) list.add(new Ambulance(id));
            else list.add(new Taxi(id));
        }

        System.out.println("\nPrioritizing emergency services:");
        list.stream().filter(s -> s instanceof EmergencyService).forEach(s ->
            System.out.println("EMERGENCY: " + s.getType() + " " + s.getId())
        );

        System.out.println("\nOther services:");
        list.stream().filter(s -> !(s instanceof EmergencyService)).forEach(s ->
            System.out.println("NORMAL: " + s.getType() + " " + s.getId())
        );

        sc.close();
    }
}