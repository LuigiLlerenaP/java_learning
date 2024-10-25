package ec.Matrix;

public class ExampleMatrixAddRowAndColumn {
    public static void main(String[] args) {
        int addRow , addCol;
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i=0;i<a.length;i++){
            addCol =0;
            addRow =0;
            for (int j=0;j<a[i].length;j++){
                addCol += a[j][i];
                addRow += a[i][j];
            }
            System.out.printf("Total row is : %d \n",addRow);
            System.out.printf("Total column is : %d \n",addCol);
        }
    }
}
