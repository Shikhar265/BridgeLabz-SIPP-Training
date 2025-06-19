import java.util.Random;

public class MatrixOperations {

    // 1. Method to create a random matrix
    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // Random values 0–9

        return matrix;
    }

    // 2. Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] + b[i][j];

        return result;
    }

    // 3. Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] - b[i][j];

        return result;
    }

    // 4. Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = a[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += a[i][k] * b[k][j];

        return result;
    }

    // Utility method to display a matrix
    public static void printMatrix(String label, int[][] matrix) {
        System.out.println(label);
        for (int[] row : matrix) {
            for (int value : row)
                System.out.printf("%4d", value);
            System.out.println();
        }
    }

    // Main method to run matrix operations
    public static void main(String[] args) {
        int rows = 3, cols = 3;

        int[][] matrixA = generateRandomMatrix(rows, cols);
        int[][] matrixB = generateRandomMatrix(rows, cols);

        printMatrix("Matrix A:", matrixA);
        printMatrix("Matrix B:", matrixB);

        // Matrix Addition
        int[][] sum = addMatrices(matrixA, matrixB);
        printMatrix("Addition (A + B):", sum);

        // Matrix Subtraction
        int[][] diff = subtractMatrices(matrixA, matrixB);
        printMatrix("Subtraction (A - B):", diff);

        // Matrix Multiplication
        int[][] product = multiplyMatrices(matrixA, matrixB);
        printMatrix("Multiplication (A x B):", product);
    }
}
S