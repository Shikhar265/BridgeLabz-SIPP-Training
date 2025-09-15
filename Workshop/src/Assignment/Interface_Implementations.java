package Assignment;

import java.util.*;

interface TransportService {
    String getId();
    String getType();
    void startService();
    void stopService();
}

class BusService implements TransportService {
    String id;
    BusService(String id) { this.id = id; }
    public String getId() { return id; }
    public String getType() { return "Bus"; }
    public void startService() { System.out.println("Bus " + id + " started."); }
    public void stopService() { System.out.println("Bus " + id + " stopped."); }
}

class MetroService implements TransportService {
    String id;
    MetroService(String id) { this.id = id; }
    public String getId() { return id; }
    public String getType() { return "Metro"; }
    public void startService() { System.out.println("Metro " + id + " started."); }
    public void stopService() { System.out.println("Metro " + id + " stopped."); }
}

public class Interface_Implementations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter service type (bus/metro) and id (space separated): ");
        String type = sc.next();
        String id = sc.next();
        TransportService svc;
        if ("bus".equalsIgnoreCase(type)) svc = new BusService(id);
        else svc = new MetroService(id);

        svc.startService();
        svc.stopService();

        sc.close();
    }
}
