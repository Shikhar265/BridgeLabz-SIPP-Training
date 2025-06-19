import java.util.*;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    // Method to check if OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) {
                return false; // Duplicate found
            }
        }
        return true; // All unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("✅ All OTPs are unique.");
        } else {
            System.out.println("❌ Duplicate OTPs found.");
        }
    }
}
