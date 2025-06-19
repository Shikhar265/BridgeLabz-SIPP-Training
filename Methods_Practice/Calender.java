import java.util.*;

public class CalendarDisplay {

    // Method to get month name
    public static String getMonthName(int month) {
        String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month];
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month];
    }

    // Method to calculate day of the week using Zeller's Congruence
    public static int getStartDay(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int q = 1;
        int m = month;
        int k = year % 100;
        int j = year / 100;

        int h = (q + 13*(m + 1)/5 + k + k/4 + j/4 + 5*j) % 7;
        return (h + 6) % 7; // Adjust for Sunday = 0
    }

    // Method to print the calendar
    public static void printCalendar(int month, int year) {
        int startDay = getStartDay(month, year);
        int totalDays = getDaysInMonth(month, year);
        String monthName = getMonthName(month);

        System.out.printf("   %s %d\n", monthName, year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Indentation for the first line
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print days of the month
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d", day);
            if ((day + startDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year (>=1582): ");
        int year = sc.nextInt();

        if (month < 1 || month > 12 || year < 1582) {
            System.out.println("Invalid input!");
            return;
        }

        printCalendar(month, year);
    }
}
