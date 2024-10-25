package ec.Arrays;

import java.util.Scanner;

public class ExampleArrayPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int maxLength = array.length;
        int element , position = 0, last ;

        for (int i = 0; i < maxLength; i++) {
            System.out.printf("Enter array index %d element: " ,i);
            array[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("New element  ?");
        element = sc.nextInt();
        while (position <6 && element> array[position]) {
          position++;
        }

        last = array[maxLength -1];
        for (int i = maxLength -1 ; i >= position; i--) {
            array[i+1] = array[i];
        }
        int[] b = new int[maxLength+1];
        int maxLenB = array.length;
        System.arraycopy(array,0,b,0,maxLength);
        if (element > last){
            b[maxLenB-1] = element;
        }else {
        b[maxLenB - 1] = last ;
        b[position] = element;
        }
        System.out.println("The new array is :");
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
