package Assignment;

import java.util.*;

interface GeoUtils {
    static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;
        return Math.sqrt(dx*dx + dy*dy);
    }
}

public class Static_Method_Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 y1:");
        double x1 = Double.parseDouble(sc.next());
        double y1 = Double.parseDouble(sc.next());
        System.out.println("Enter x2 y2:");
        double x2 = Double.parseDouble(sc.next());
        double y2 = Double.parseDouble(sc.next());

        double dist = GeoUtils.calculateDistance(x1, y1, x2, y2);
        System.out.println("Distance = " + dist);

        sc.close();
    }
}
