package ec.Matrix;

public class ExampleMatrixTransposed {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix:");
        int aux = 0 ;
        for (int i = 1; i< matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = aux;
            }
        }

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }

    }
}
