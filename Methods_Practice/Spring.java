import java.util.*;

public class SpringSeason {

    // Method to check if the date falls in the Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // March 20 to March 31
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        // April 1 to April 30
        else if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }
        // May 1 to May 31
        else if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }
        // June 1 to June 20
        else if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: month
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        // Input: day
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        // Check and print result
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
