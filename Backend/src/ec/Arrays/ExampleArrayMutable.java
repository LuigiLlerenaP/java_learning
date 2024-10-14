package ec.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ExampleArrayMutable {
    public static void main(String[] args) {
        // Initialize an array of car brands
        String[] cards = {"chevrolet", "kia", "toyota", "nissan", "mazda", "ferry", "fiat"};

        // Print the original array
        System.out.println("Original array:");
        for (String card : cards) {
            System.out.printf("Value: %s%n", card);
        }

        // Invert the array manually using a helper method
        System.out.println("\nInverting array manually...");
        arrayInverterPosition(cards);

        // Print the manually inverted array
        System.out.println("Array after manual inversion:");
        for (String card : cards) {
            System.out.printf("Value: %s%n", card);
        }

        // Invert the array again using Collections.reverse()
        System.out.println("\nInverting array using Collections.reverse()...");
        Collections.reverse(Arrays.asList(cards));

        // Print the inverted array after using Collections.reverse()
        System.out.println("Array after using Collections.reverse():");
        for (String card : cards) {
            System.out.printf("Value: %s%n", card);
        }
    }

    // Helper method to manually invert an array
    public static void arrayInverterPosition(String[] array) {
        int last = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            // Swap the elements at index i and last-i
            String temp = array[i];
            array[i] = array[last - i];
            array[last - i] = temp;
        }
    }
}
