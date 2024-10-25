package ec.Arrays;

import java.util.Scanner;

public class ExampleArraysDeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int  len = arr.length;

        for (int i=0 ; i< len ; i++){
            System.out.print("Insert the numbers ");
            arr[i]= sc.nextInt();
        }
        System.out.println();
        System.out.println("Giv me the position do yuo want to delete");
        int positionDelete = sc.nextInt();

        for (int i= positionDelete; i < len -1 ; i++){
            arr[i] = arr[i+1];
        }
        int[] arrayB =  new int[len-1];
        System.arraycopy(arr,0,arrayB,0,len-1);

        for (int j : arrayB) {
            System.out.print(j + " ");
        }

    }
}
