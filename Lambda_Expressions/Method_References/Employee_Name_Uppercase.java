// Employee_Name_Uppercase.java

import java.util.*;
import java.util.stream.*;

public class Employee_Name_Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 User se employee count lena
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // buffer clear

        List<String> employees = new ArrayList<>();

        // 🔹 User se employee names lena
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Employee Name " + i + ": ");
            String name = sc.nextLine();
            employees.add(name);
        }

        System.out.println("\n=== Employee Names in UPPERCASE ===");

        // 🔹 Stream + Method Reference (String::toUpperCase)
        employees.stream()
                 .map(String::toUpperCase)   // convert each name
                 .forEach(System.out::println); // print

        sc.close();
    }
}
