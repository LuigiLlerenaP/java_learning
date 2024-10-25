package ec.Matrix;

public class ExampleMatrixIterator {
    public static void main(String[] args) {
        String[][] numbers = new String[2][2];
        numbers[0][0] = "Teachers";
        numbers[0][1] = "Students";
        numbers[1][0] = "Luis ";
        numbers[1][1] = "Juan";

        // First iteration using traditional for loop
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                // Using trim to remove extra spaces
                System.out.println(numbers[i][j].trim());
            }
        }

        System.out.println(); // Add a new line for better separation between loops

        // Second iteration using enhanced for-each loop
        for (String[] row : numbers) {
            for (String column : row) {
                // Trimming for consistency
                System.out.print(column.trim() + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
