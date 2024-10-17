package ec.Arrays;

import java.util.Scanner;

public class ExampleArrayMovePositionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; // Create an array of size 10
        int maxLength = arr.length; // Get the maximum length of the array
        int element, position;

        // Fill the array with user input
        for (int i = 0; i < maxLength - 1; i++) {
            System.out.println("Insert the number:");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Insert the element:");
        element = sc.nextInt(); // Get the element to insert
        System.out.println("Insert the position (0 to " + (maxLength - 1) + "):");
        position = sc.nextInt(); // Get the position for insertion

        // Validate the insertion position
        if (position < 0 || position >= maxLength) {
            System.out.println("Invalid position. Please enter a position between 0 and " + (maxLength - 1));
            return; // Exit the program if the position is invalid
        }

        // Move elements to the right to make space for the new element
        for (int i = maxLength - 2; i >= position-1; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert the new element at the specified position
        arr[position] = element;

        // Display the resulting array
        System.out.println("The array is:");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
