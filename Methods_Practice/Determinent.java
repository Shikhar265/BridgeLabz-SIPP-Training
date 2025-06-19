import java.util.Random;

public class MatrixManipulation {

    // Generate a random NxN matrix
    public static double[][] generateRandomMatrix(int size) {
        double[][] matrix = new double[size][size];
        Random rand = new Random();
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = rand.nextInt(10);  // Values from 0–9
        return matrix;
    }

    // 1. Transpose of matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int n = matrix.length;
        double[][] result = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[j][i] = matrix[i][j];
        return result;
    }

    // 2. Determinant of 2x2 or 3x3 matrix
    public static double determinant(double[][] matrix) {
        int n = matrix.length;
        if (n == 2) {
            return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
        } else if (n == 3) {
            return matrix[0][0] * (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1])
                 - matrix[0][1] * (matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0])
                 + matrix[0][2] * (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]);
        } else {
            throw new IllegalArgumentException("Only 2x2 or 3x3 matrices are supported");
        }
    }

    // 3. Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant(matrix);
        if (det == 0) throw new ArithmeticException("Matrix is singular, no inverse");

        double[][] inv = new double[2][2];
        inv[0][0] = matrix[1][1] / det;
        inv[0][1] = -matrix[0][1] / det;
        inv[1][0] = -matrix[1][0] / det;
        inv[1][1] = matrix[0][0] / det;

        return inv;
    }

    // Utility to print matrix
    public static void printMatrix(String label, double[][] matrix) {
        System.out.println(label);
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // You can switch between size = 2 or 3
        int size = 2; // Change to 3 for 3x3 matrix

        double[][] matrix = generateRandomMatrix(size);
        printMatrix("Original Matrix:", matrix);

        // Transpose
        double[][] transposed = transposeMatrix(matrix);
        printMatrix("Transposed Matrix:", transposed);

        // Determinant
        try {
            double det = determinant(matrix);
            System.out.printf("Determinant: %.2f\n", det);

            // Inverse (only for 2x2)
            if (size == 2) {
                double[][] inverse = inverse2x2(matrix);
                printMatrix("Inverse Matrix:", inverse);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
