package ec.Matrix;

import java.util.Scanner;

public class ExampleMatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] numbers = {
                {1, 2, 3, 4, 5, 6},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
        };

        System.out.println("Enter the number to search for: ");
        int number = sc.nextInt();
        boolean isFound = false;

        int i = -1; // Initialize to -1 to indicate "not found"
        int j = -1; // Initialize to -1 to indicate "not found"

        search: for (i = 0; i < numbers.length; i++) {
            for (j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == number) {
                    isFound = true;
                    break search;
                }
            }
        }

        // Use conditional for clarity
        if (isFound) {
            System.out.printf("The number was found at index (%d, %d)\n", i, j);
        } else {
            System.out.println("The number was not found in the matrix.");
        }
    }
}
