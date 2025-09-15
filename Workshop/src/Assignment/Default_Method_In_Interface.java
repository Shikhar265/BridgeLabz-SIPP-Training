package Assignment;

import java.util.*;

interface TransportService {
    String getId();
    String getType();

    // default method provided
    default void printServiceDetails() {
        System.out.println("Service[" + getId() + "] Type=" + getType());
    }
}

class BusService implements TransportService {
    String id;
    BusService(String id) { this.id = id; }
    public String getId() { return id; }
    public String getType() { return "Bus"; }
    // can override but not required
}

public class Default_Method_In_Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bus service id: ");
        String id = sc.nextLine();

        TransportService bus = new BusService(id);
        // Default method used
        bus.printServiceDetails();

        sc.close();
    }
}
