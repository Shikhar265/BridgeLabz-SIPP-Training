public class QuadraticSolver {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] {root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] {root};
        } else {
            return new double[] {}; // No real roots
        }
    }

    public static void main(String[] args) {
        double[] roots = findRoots(1, -3, 2); // Example: x² - 3x + 2 = 0
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else {
            System.out.println("Roots: ");
            for (double r : roots) System.out.println(r);
