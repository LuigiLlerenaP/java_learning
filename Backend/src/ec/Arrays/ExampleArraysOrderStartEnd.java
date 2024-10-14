package ec.Arrays;

public class ExampleArraysOrderStartEnd {
    public static void main(String[] args) {
        // Initialize two arrays of size 10
        int[] numbers = new int[10];
        int[] numbers2 = new int[10];
        int length = numbers.length;

        // Fill the 'numbers' array with values from 1 to 10
        for (int i = 0; i < length; i++) {
            numbers[i] = i + 1;
        }

        int aux = 0; // 'aux' keeps track of the index for the 'numbers2' array

        // Fill 'numbers2' by alternating between the start and end of the 'numbers' array
        for (int i = 0; i < length / 2; i++) {
            // First take an element from the start of 'numbers'
            numbers2[aux++] = numbers[i];
            // Then take an element from the end of 'numbers'
            numbers2[aux++] = numbers[length - i - 1];
        }

        // Print the elements of the 'numbers2' array in order
        for (int num : numbers2) {
            System.out.printf("%d ", num); // Output each number followed by a space
        }
    }
}
