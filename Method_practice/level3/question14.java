import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrixA = generateMatrix(rows, cols);
        int[][] matrixB = generateMatrix(rows, cols);

        int[][] sum = addMatrices(matrixA, matrixB);
        int[][] diff = subtractMatrices(matrixA, matrixB);
        int[][] product = multiplyMatrices(matrixA, matrixB);

        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);
        System.out.println("Sum (A + B):");
        printMatrix(sum);
        System.out.println("Difference (A - B):");
        printMatrix(diff);
        System.out.println("Product (A x B):");
        printMatrix(product);
    }

    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = b[0].length, common = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
}
