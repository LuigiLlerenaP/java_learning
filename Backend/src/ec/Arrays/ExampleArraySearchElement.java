package ec.Arrays;

import java.util.Scanner;

public class ExampleArraySearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int max = a.length;
        for (int i = 0; i < max; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("\r\nInsert a number to search");
        int num = sc.nextInt();
        String search = "Element not found";
        for (int i = 0; i < max; i++) {
            if (a[i] == num) {
                search = "Element found at index " + i;
                break;
            }
        }
        System.out.printf("The result was: %s\n", search);

    }
}
