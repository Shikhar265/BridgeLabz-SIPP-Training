

import java.util.Scanner;

// 🔹 Interface with static utility method
interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        // Rule: At least 8 chars, contains uppercase, lowercase, digit, and special char
        if (password.length() < 8) return false;

        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}

public class Password_Strength_Validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        // 🔹 Call static method from interface
        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("✅ Strong password! Accepted.");
        } else {
            System.out.println("❌ Weak password! Please follow policy rules.");
        }

        sc.close();
    }
}
