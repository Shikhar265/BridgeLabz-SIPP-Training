import java.util.Scanner;

public class Q1_SearchFirstNegativeNumber {
    public static int findFirstNegativeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int result = findFirstNegativeIndex(arr);
        System.out.println("First negative number index: " + result);
    }
}
