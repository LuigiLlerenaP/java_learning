package ec.Arrays;

import java.util.Scanner;

public class ExampleArraysMovePosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNumbs = new int[10];
        int maxLength = arrayNumbs.length;
        int lastValue = 0;


        for (int i = 0; i < maxLength; i++) {
            System.out.println("Insert the number:");
            arrayNumbs[i] = sc.nextInt();
        }


        lastValue = arrayNumbs[maxLength - 1];


        for (int i = maxLength - 2; i >= 0; i--) {
            arrayNumbs[i + 1] = arrayNumbs[i];
        }


        arrayNumbs[0] = lastValue;

        // Imprimir el array modificado
        for (int a : arrayNumbs) {
            System.out.printf("The array is: %d\n", a);
        }
    }
}
