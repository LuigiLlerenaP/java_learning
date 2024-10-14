package ec.Arrays;

import java.util.Arrays;

public class ExampleArraySort {
    public static void main(String[] args) {
        // Initialize an array with 10 fruits
        String[] fruits = new String[10];
        fruits[0] = "Apple";
        fruits[1] = "Bananas";
        fruits[2] = "Orange";
        fruits[3] = "Watermelon";
        fruits[4] = "Grapes";
        fruits[5] = "Pineapple";
        fruits[6] = "Mango";
        fruits[7] = "Pearl";
        fruits[8] = "Pineapple";
        fruits[9] = "Pineapple";

        int fruitsLength = fruits.length;

        // Print each fruit and its index
        System.out.println("Fruits in the original order:");
        for (int i = 0; i < fruitsLength; i++) {
            System.out.printf("The fruit at index %d is %s.%n", i, fruits[i]);
        }

        // Sort the array using Arrays.sort()
        System.out.println("\nSorting the array items using Arrays.sort():");
        Arrays.sort(fruits);

        // Print the sorted array
        System.out.println("Fruits in sorted order:");
        for (String fruit : fruits) {
            System.out.printf("The fruit is %s.%n", fruit);
        }
    }
}
