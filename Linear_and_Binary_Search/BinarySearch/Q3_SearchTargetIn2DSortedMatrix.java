import java.util.Scanner;

public class Q3_SearchTargetIn2DSortedMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int val = matrix[mid / cols][mid % cols];

            if (val == target) return true;
            else if (val < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements (row-wise):");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target found: " + found);
    }
}
