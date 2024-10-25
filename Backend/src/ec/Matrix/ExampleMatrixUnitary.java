package ec.Matrix;

public class ExampleMatrixUnitary {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i==j){
                    matrix[i][j]=1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
