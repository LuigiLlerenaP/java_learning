package ec.Arrays;

public class ExampleCompareToPrimitive {
    // Generic Bubble Sort that works with any type of Object array
    public static void BubbleSort(Object[] array) {
        int arrayLength = array.length;
        // Bubble Sort Algorithm
        for (int i = 0; i < arrayLength - 1; i++) {
            boolean swapped = false; // Tracks if any swapping happens in the current pass

            // Compare adjacent elements in the array
            for (int j = 0; j < arrayLength - 1 - i; j++) {
                // Use the Comparable interface to compare elements
                // The next element is compared to the current one
                if (((Comparable) array[j + 1]).compareTo(array[j]) < 0) {
                    // If they are out of order, swap the elements
                    Object aux = array[j]; // Store the current element in a temporary variable
                    array[j] = array[j + 1]; // Move the next element to the current position
                    array[j + 1] = aux; // Move the current element to the next position
                    swapped = true; // Mark that a swap occurred
                }
            }

            // If no elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break; // Exit the loop early if no swaps happened, meaning the array is sorted
            }
        }
    }

    public static void main(String[] args) {
        // Array of Double objects to be sorted
        Double[] decimalNumbers = {4.75, 1.1, 5.62, 3.14, 2.5, 6.89};

        // Sorting the array using Bubble Sort
        BubbleSort(decimalNumbers);

        // Print the sorted array
        System.out.println("Sorted decimal numbers:");
        for (double number : decimalNumbers) {
            System.out.printf("%.2f ", number); // Print each number with 2 decimal places
        }
    }
}
