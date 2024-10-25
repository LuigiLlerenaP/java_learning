package ec.Matrix;

public class ExampleMatrix {
    public static void main(String[] args) {
        int [][] numbers = new int[3][4];

        // Initializing the matrix
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;

        numbers[1][0] = 11;
        numbers[1][1] = 12;
        numbers[1][2] = 13;
        numbers[1][3] = 14;

        numbers[2][0] = 21;
        numbers[2][1] = 22;
        numbers[2][2] = 23;
        numbers[2][3] = 24;

        // Print the first number
        int firstNumber = numbers[0][0];
        System.out.printf("The first number is %d\n", firstNumber);

        // Loop through the matrix and print each number
        for (int[] row : numbers) {
            for (int num : row) {
                System.out.print(num + " "); // Add a space between numbers
            }
            System.out.println(); // Move to the next line after each row
        }

        // Print the total number of rows  and columns in the matrix
        System.out.printf("The total number of rows in this matrix: %d\n", numbers.length);
        System.out.printf("The number of columns in this matrix: %d\n", numbers[0].length);

        // Print the last element of the matrix
        System.out.printf("The last element of the matrix is %d\n", numbers[numbers.length - 1][numbers[0].length - 1]);
    }
}
