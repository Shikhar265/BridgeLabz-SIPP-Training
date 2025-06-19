import java.util.*;

public class Main {

    // Corrected method signature to return a single double value
    public int Handshakes(int n) {
        int combination = (n * (n - 1)) / 2;
        return combination;
    }

    public static void main(String[] args) {
        Main calculator = new Main();
        Scanner sc = new Scanner(System.in);

        // Input No. of Students
        System.out.print("Enter No. of Students: ");
        int n = sc.nextInt();

        int result = calculator.Handshakes(n);

        // Display the result
        System.out.println("Total Number of Handshakes: " + result);
    }
}
