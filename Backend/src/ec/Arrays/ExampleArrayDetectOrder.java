package ec.Arrays;

import java.util.Scanner;

public class ExampleArrayDetectOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare an array of size 5
        int[] a = new int[5];
        System.out.println("Insert 5 numbers into the array:");
        int length = a.length;

        // Populate the array with user input
        for (int i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }

        boolean isAsc = false;  // Flag to detect if the array is in ascending order
        boolean isDesc = false; // Flag to detect if the array is in descending order

        // Check the order of the array by comparing adjacent elements
        for (int i = 0; i < length - 1; i++) {
            if (a[i] > a[i + 1]) {
                isDesc = true; // If current element is greater than the next, it's descending
            }
            if (a[i] < a[i + 1]) {
                isAsc = true;  // If current element is smaller than the next, it's ascending
            }
        }

        // Output the result based on the flags
        if (isAsc && isDesc) {
            System.out.println("Disordered");  // Array is neither strictly ascending nor descending
        }

        if (!isAsc && !isDesc) {
            System.out.println("All elements are the same");  // Array has no variation in values
        }

        if (isAsc && !isDesc) {
            System.out.println("Ascending order");  // Array is strictly in ascending order
        }

        if (!isAsc && isDesc) {
            System.out.println("Descending order"); // Array is strictly in descending order
        }
    }
}
