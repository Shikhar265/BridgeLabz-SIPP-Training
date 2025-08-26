
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// 🔹 Interface with static method for date formatting
interface DateFormatter {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class Date_Format_Utility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 User enters a date
        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        System.out.println("\n=== Formatted Dates ===");
        System.out.println("Invoice Format (dd/MM/yyyy): " + DateFormatter.formatDate(date, "dd/MM/yyyy"));
        System.out.println("Database Format (yyyy-MM-dd): " + DateFormatter.formatDate(date, "yyyy-MM-dd"));
        System.out.println("US Format (MM-dd-yyyy): " + DateFormatter.formatDate(date, "MM-dd-yyyy"));
        System.out.println("Month-Year Format (MMMM yyyy): " + DateFormatter.formatDate(date, "MMMM yyyy"));

        sc.close();
    }
}
