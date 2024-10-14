package ec.Arrays;

public class ExampleArray {
    public static void main(String[] args) {
        // Create and initialize an array of primitive type (int)
        int[] numbers = new int[4]; // Array with 4 elements, initially set to 0

        // Print the value at index 0 (default value is 0)
        System.out.printf("Number at index 0: %d%n", numbers[0]);

        // Print the default values in the array (all elements should be 0)
        System.out.print("Default values in the array: ");
        for (int number : numbers) {
            System.out.printf("%d ", number); // Space-separated values for clarity
        }
        System.out.println(); // New line after printing default values

        // Assign values to the array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

        // Print the updated values in the array
        System.out.println("Updated values in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("The number at index %d is: %d%n", i, numbers[i]);
        }

        // Print the last index and the value at that index
        int lastIndex = numbers.length - 1; // Calculate the last index
        System.out.printf("The last index of the array is: %d%n", lastIndex);
        System.out.printf("The value at the last index is: %d%n", numbers[lastIndex]);
    }
}
