import java.util.*;

public class FootballStats {

    public static int sum(int[] arr) {
        int total = 0;
        for (int h : arr) total += h;
        return total;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }

    public static int max(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < 11; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150–250 cm
        }

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
        System.out.printf("Mean Height: %.2f\n", mean(heights));
    }
}
