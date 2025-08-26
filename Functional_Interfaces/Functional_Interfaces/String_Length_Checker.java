// String_Length_Checker.java

import java.util.Scanner;
import java.util.function.Function;

public class String_Length_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 Taking character limit from user
        System.out.print("Enter character limit: ");
        int limit = sc.nextInt();
        sc.nextLine(); // consume newline

        // 🔹 Taking message input
        System.out.print("Enter your message: ");
        String message = sc.nextLine();

        // 🔹 Function to calculate length of String
        Function<String, Integer> getLength = str -> str.length();

        // 🔹 Apply function
        int length = getLength.apply(message);

        // 🔹 Compare with limit
        if (length > limit) {
            System.out.println("⚠️ Message length (" + length + ") exceeds limit of " + limit + " characters!");
        } else {
            System.out.println("✅ Message length (" + length + ") is within limit of " + limit + " characters.");
        }

        sc.close();
    }
}
