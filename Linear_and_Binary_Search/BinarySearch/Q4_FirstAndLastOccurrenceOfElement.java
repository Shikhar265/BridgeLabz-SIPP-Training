import java.util.Scanner;

public class Q4_FirstAndLastOccurrenceOfElement {
    public static int findFirst(int[] arr, int target) {
        int res = -1, left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                res = mid;
                right = mid - 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return res;
    }

    public static int findLast(int[] arr, int target) {
        int res = -1, left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                res = mid;
                left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter sorted array elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        if (first != -1)
            System.out.println("First Occurrence: " + first + ", Last Occurrence: " + last);
        else
            System.out.println("Element not found.");
    }
}
