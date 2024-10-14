package ec.Arrays;

import java.util.Scanner;

public class ExampleMaxNumberFinder {
    public static void main(String[] args) {
        // Declaring an array to store 5 integers
        int[] numbers = new int[5];
        // Getting the length of the array
        int numbersLength = numbers.length;
        // Creating a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Asking the user to input 5 numbers
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < numbersLength; i++) {
            // Storing the input numbers in the array
            numbers[i] = sc.nextInt();
        }

        // Initializing 'max' to store the index of the maximum number
        // Start with index 0 as the initial maximum
        int max = 0;

        // Looping through the array to find the index of the largest number
        for (int i = 0; i < numbersLength; i++) {
            // If the number at index 'i' is greater than the current max number,
            // update 'max' to the current index 'i'
            max = (numbers[max] > numbers[i]) ? max : i;
        }

        // Printing the largest number found using the index 'max'
        System.out.printf("The largest number is %d", numbers[max]);
    }
}
