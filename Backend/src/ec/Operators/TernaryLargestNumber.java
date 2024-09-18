package ec.Operators;

import java.util.Scanner;

public class TernaryLargestNumber {
    public static void main(String[] args) {
        int maxNumber;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the first number: ");
        int numOne = sc.nextInt();

        System.out.print("Insert the second number: ");
        int numTwo = sc.nextInt();

        System.out.print("Insert the third number: ");
        int numThree = sc.nextInt();

        System.out.print("Insert the fourth number: ");
        int numFour = sc.nextInt();

        // Use ternary operators to find the largest number
        maxNumber = (numOne > numTwo) ? numOne : numTwo;
        maxNumber = (maxNumber > numThree) ? maxNumber : numThree;
        maxNumber = (maxNumber> numFour)? maxNumber: numFour;

        System.out.println("The largest number is: " + maxNumber);


    }
}
