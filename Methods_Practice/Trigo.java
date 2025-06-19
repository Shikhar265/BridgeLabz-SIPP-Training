import java.util.*;

public class TrigonometricCalculator {

        public double[] calculateTrigonometricFunctions(double angleInDegrees) {
        
        double angleInRadians = Math.toRadians(angleInDegrees);

        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);

        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        TrigonometricCalculator calculator = new TrigonometricCalculator();
	Scanner sc=new Scanner(System.in);

        // Example angle
        double angle = sc.nextDouble();

        // Call the method
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("Angle: " + angle + " degrees");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}
