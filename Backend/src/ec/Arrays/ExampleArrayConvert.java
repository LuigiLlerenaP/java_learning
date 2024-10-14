package ec.Arrays;

public class ExampleArrayConvert {
    public static void main(String[] args) {
        // Declaring three integer arrays a, b, and c
        int[] a, b, c;

        // Initializing array 'a' with a size of 10
        a = new int[10];
        // Getting the length of array 'a'
        int lengthA = a.length;

        // Initializing array 'b' with the same size as array 'a'
        b = new int[lengthA];
        // Getting the length of array 'b'
        int lengthB = b.length;

        // Initializing array 'c' with a size of 20
        c = new int[20];

        // Filling array 'a' with values 1, 2, 3, ..., 10
        for (int i = 0; i < lengthA; i++) {
            a[i] = (i + 1);
        }

        // Printing values of array 'a'
        for (int showA : a) {
            System.out.printf("The value for a: %d\n", showA);
        }

        // Filling array 'b' with multiples of 5 (5, 10, 15, ..., 50)
        for (int i = 0; i < lengthB; i++) {
            b[i] = (i + 1) * 5;
        }

        // Printing values of array 'b'
        for (int showB : b) {
            System.out.printf("The value for b: %d\n", showB);
        }

        // Merging arrays 'a' and 'b' into array 'c'
        // Each element from 'a' is followed by the corresponding element from 'b'
        // First 10 elements of 'a' and 'b' are placed alternately in 'c'
        int aux = 0;
        for (int i = 0; i < 10; i++) {
            c[aux++] = a[i];  // Adding elements from 'a' to 'c'
            c[aux++] = b[i];  // Adding elements from 'b' to 'c'
        }

        // Printing values of array 'c'
        for (int showC : c) {
            System.out.printf("The value for c: %d\n", showC);
        }
    }
}
