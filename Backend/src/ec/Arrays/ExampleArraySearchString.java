package ec.Arrays;

import java.util.Scanner;

public class ExampleArraySearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5];
        System.out.println("Enter array elements:");

        int maxLength = array.length;
        for (int i = 0; i < maxLength; i++) {
            array[i] = sc.next();
        }

        System.out.println("Enter element to be searched:");
        String search = sc.next().trim();

        String searched = "The element was not found";


        for (int i = 0; i < maxLength; i++) {
            if (array[i].trim().equalsIgnoreCase(search)) {
                searched = "The element was found at index " + i;
                break;
            }
        }
        System.out.printf("The result is: %s\n", searched);
    }
}
