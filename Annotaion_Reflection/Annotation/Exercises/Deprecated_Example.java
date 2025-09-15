import java.util.Scanner;

class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("⚠️ Using old feature (deprecated). This may be removed in future!");
    }

    public void newFeature() {
        System.out.println("✅ Using new feature (recommended).");
    }
}

public class Deprecated_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LegacyAPI api = new LegacyAPI();

        // Ask user which feature to use
        System.out.println("Choose feature to use:");
        System.out.println("1. Old Feature (Deprecated)");
        System.out.println("2. New Feature");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            api.oldFeature();
        } else if (choice == 2) {
            api.newFeature();
        } else {
            System.out.println("❌ Invalid choice");
        }

        sc.close();
    }
}
