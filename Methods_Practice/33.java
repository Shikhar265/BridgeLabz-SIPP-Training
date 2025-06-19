import java.util.*;

public class NumberChecker {
    
    // Q33 - Factor Related
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }

        return factors;
    }

    public static int getGreatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    public static int getSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long getProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double getProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }
}
