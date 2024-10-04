package MATRIX;

public class MatrixAddition {

    public static void main(String[] args) {
        int[][] matrixA = { { 1, 2, 3 }, { 1, 5, 3 } };
        int[][] matrixB = { { 1, 3, 3 }, { 1, 6, 3 } };
        int[][] matrixC = { { 1, 4, 3 }, { 1, 7, 3 } };


        int[][] result = addMatrices(matrixA, matrixB, matrixC);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB, int[][] matrixC) {
        // Check if matrices can be added
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            throw new ArithmeticException("Matrices are not the same size");
        }

        int[][] result = new int[matrixA.length][matrixA[0].length];

        // Add corresponding elements of the matrices
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return result;
    }
}