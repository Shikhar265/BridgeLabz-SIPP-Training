import java.util.*;

public class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int) (Math.random() * 9000); // 1000–9999
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = (double) sum / numbers.length;
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        int[] randomNums = generate4DigitRandomArray(5);
        System.out.println("Generated Numbers: " + Arrays.toString(randomNums));

        double[] stats = findAverageMinMax(randomNums);
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + (int) stats[1]);
        System.out.println("Maximum: " + (int) stats[2]);
    }
}
