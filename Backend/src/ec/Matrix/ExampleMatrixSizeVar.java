package ec.Matrix;

public class ExampleMatrixSizeVar {
    public static void main(String[] args) {
        // Declare a matrix with 3 rows of varying sizes
        int[][] mat = new int[3][];
        mat[0] = new int[2]; // 2 columns in the first row
        mat[1] = new int[3]; // 3 columns in the second row
        mat[2] = new int[4]; // 4 columns in the third row

        // Print the number of rows and columns in each row
        System.out.printf("Matrix rows: %d%n", mat.length);
        System.out.printf("Row 0 length: %d%n", mat[0].length);
        System.out.printf("Row 1 length: %d%n", mat[1].length);
        System.out.printf("Row 2 length: %d%n", mat[2].length);

        // Fill the matrix with values (i * j)
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = i * j;
            }
        }

        // Print the matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t"); // Use tab for better alignment
            }
            System.out.println(); // New line after each row
        }
    }
}
