package ec.Matrix;

public class ExampleMatrixIteratorTwo {
    public static void main(String[] args) {
        // Matrix of names
        String[][] names = {
                {"Teacher", "Personal", "Students"},
                {"Juan", "Maria", "Pepe"},
                {"Ana", "Luigi", "Maria"}
        };

        // Iterate over the matrix and print elements
        for (String[] row : names) {
            for (String column : row) {
                // Use print to stay on the same line with tabs between elements
                System.out.print(column + "\t");
            }
            // New line after each row
            System.out.println();
        }
    }
}

