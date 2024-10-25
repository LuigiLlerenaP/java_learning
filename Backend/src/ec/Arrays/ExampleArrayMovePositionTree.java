package ec.Arrays;

import java.util.Scanner;

public class ExampleArrayMovePositionTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7]; // Create an array of size 7
        int maxLength = array.length;

        int number, position;

        // We have seven spaces, but the last space is for searching and moving position
        for (int i = 0; i < maxLength - 1; i++) {
            System.out.println("Insert one number:");
            array[i] = sc.nextInt(); // Fill the array with user input
        }

        System.out.println("Insert a number to insert:");
        number = sc.nextInt(); // Get the number to insert

        position = 0;

        // Find the appropriate position for the new number
        while (position < maxLength - 1 && number > array[position]) {
            position++; // Increment position until we find the right place for the number
        }

        // Move elements to the right to make space for the new number
        for (int i = maxLength - 2; i >= position; i--) {
            array[i + 1] = array[i]; // Shift elements to the right
        }

        // Insert the new number at the found position
        array[position] = number;

        // Display the new array
        System.out.println("The new array is:");
        for (int i = 0; i < maxLength; i++) {
            System.out.print(array[i] + " "); // Print each element of the array
        }
    }
}
