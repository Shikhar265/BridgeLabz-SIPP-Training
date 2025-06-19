import java.util.*;
public class UnitConverter {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Km :");
	int a=sc.nextInt();
	System.out.println("Miles :");
	int b=sc.nextInt();
	System.out.println("Meters :");
	int c=sc.nextInt();
	System.out.println("Feet :");
	int d=sc.nextInt();
        System.out.println("5 km in miles: " + convertKmToMiles(a));
        System.out.println("3 miles in km: " + convertMilesToKm(b));
        System.out.println("10 meters in feet: " + convertMetersToFeet(c));
        System.out.println("20 feet in meters: " + convertFeetToMeters(d));
    }
}
