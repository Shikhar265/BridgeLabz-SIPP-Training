// Hospital_Patient_IDs.java

import java.util.*;

public class Hospital_Patient_IDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 User se count lena
        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine(); // buffer clear

        List<String> patientIDs = new ArrayList<>();

        // 🔹 Patient IDs user input karega
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Patient ID " + i + ": ");
            String id = sc.nextLine();
            patientIDs.add(id);
        }

        System.out.println("\n=== Hospital Patient IDs ===");

        // 🔹 Method reference use karke print
        patientIDs.forEach(System.out::println);

        sc.close();
    }
}
