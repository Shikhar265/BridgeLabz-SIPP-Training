
import java.util.*;
import java.util.stream.*;

public class IoTSensorReadings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of sensor readings
        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();

        List<Integer> readings = new ArrayList<>();

        System.out.println("Enter " + n + " sensor readings:");
        for (int i = 0; i < n; i++) {
            readings.add(sc.nextInt());
        }

        // Take threshold input
        System.out.print("Enter threshold value: ");
        int threshold = sc.nextInt();

        System.out.println("\n=== Sensor Readings Above Threshold (" + threshold + ") ===");

        // 🔹 Use Streams with filter + forEach
        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("Reading: " + r));

        sc.close();
    }
}
