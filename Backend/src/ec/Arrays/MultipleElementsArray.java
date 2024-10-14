package ec.Arrays;

public class MultipleElementsArray {
    public static void main(String[] args) {
        // Declaring three integer arrays a, b, and c
        int[] a, b, c;

        // Initializing array 'a' with a size of 10
        a = new int[10];
        int lengthA = a.length;

        // Initializing array 'b' with the same size as array 'a'
        b = new int[lengthA];
        int lengthB = b.length;

        // Initializing array 'c' with a size of 20 to store elements from both 'a' and 'b'
        c = new int[20];

        // Filling array 'a' with values 1, 2, 3, ..., 10
        for (int i = 0; i < lengthA; i++) {
            a[i] = (i + 1);
        }

        // Printing the values of array 'a'
        for (int showA : a) {
            System.out.printf("The value for a: %d\n", showA);
        }

        // Filling array 'b' with multiples of 5 (5, 10, 15, ..., 50)
        for (int i = 0; i < lengthB; i++) {
            b[i] = (i + 1) * 5;
        }

        // Printing the values of array 'b'
        for (int showB : b) {
            System.out.printf("The value for b: %d\n", showB);
        }

        // Merging arrays 'a' and 'b' into array 'c' in chunks of 2 elements each
        // The goal is to add 2 elements from 'a' followed by 2 elements from 'b'
        int aux = 0; // Variable to keep track of the position in array 'c'
        for (int i = 0; i < 10; i += 2) {
            // First, we add 2 consecutive elements from array 'a' to array 'c'
            for (int j = 0; j < 2; j++) {
                c[aux++] = a[i + j];
            }

            // Then, we add 2 consecutive elements from array 'b' to array 'c'
            for (int j = 0; j < 2; j++) {
                c[aux++] = b[i + j];
            }
        }

        // Printing the values of array 'c' after merging elements from 'a' and 'b'
        for (int showC : c) {
            System.out.printf("The value for c: %d\n", showC);
        }
    }
}
