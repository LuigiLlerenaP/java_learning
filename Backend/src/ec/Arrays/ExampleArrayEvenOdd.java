package ec.Arrays;

import java.util.Scanner;

public class ExampleArrayEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10]; // Can be initialized in one line
        int countEven = 0;
        int countOdd = 0;

        System.out.print("Insert the numbers to split my array into evens and odds\n");


        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Insert the number at index %d: ", i);
            while (true) {
                try {
                    numbers[i] = Integer.parseInt(sc.nextLine()); // Error handling for input
                    break; // Exit loop if a number is entered correctly
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Please enter an integer: ");
                }
            }
        }

        // Count even and odd numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        // Initialize arrays for evens and odds
        int[] evens = new int[countEven];
        int[] odds = new int[countOdd];

        // Fill the even and odd arrays
        int evenIndex = 0, oddIndex = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evens[evenIndex++] = number; // Use a separate index for evens
            } else {
                odds[oddIndex++] = number; // Use a separate index for odds
            }
        }

        // Display the even numbers
        System.out.println("The even numbers are:");
        for (int numbEven : evens) {
            System.out.printf("%d ", numbEven);
        }
        System.out.println(); // New line for clarity

        // Display the odd numbers
        System.out.println("The odd numbers are:");
        for (int numbOdd : odds) {
            System.out.printf("%d ", numbOdd);
        }

    }
}
