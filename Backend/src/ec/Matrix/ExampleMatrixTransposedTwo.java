package ec.Matrix;

public class ExampleMatrixTransposedTwo {
    public static void main(String[] args) {
        int[][] a, b;
        a = new int[8][4]; // Original matrix with 8 rows and 4 columns
        b = new int[4][8]; // Transposed matrix with 4 rows and 8 columns

        // Fill the original matrix a
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i + j * 3; // Logic to fill the matrix
            }
        }

        // Print the original matrix a
        System.out.println("Original Matrix (a):");
        for (int[] row : a) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }

        // Transpose the matrix from a to b
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }

        // Print the transposed matrix b
        System.out.println("Transposed Matrix (b):");
        for (int[] row : b) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }
}
