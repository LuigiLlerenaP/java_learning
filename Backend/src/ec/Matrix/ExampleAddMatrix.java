package ec.Matrix;

public class ExampleAddMatrix{
    public static void main(String[] args) {
        int[][]  a = {
                {123,345,567},
                {398,345,564},
                {209,435,564}
        };
        int[][]  b = {
                {123,345,567},
                {398,345,564},
                {209,435,564}
        };

        int[][] add = new int[a.length][b.length];

        for (int i = 0; i < add.length; i++) {
            for (int j = 0; j < add[i].length; j++) {
                add[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int[] row : add) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }

    }
}
