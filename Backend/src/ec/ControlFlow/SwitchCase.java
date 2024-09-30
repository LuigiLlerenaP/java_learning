package ec.ControlFlow;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // The switch statement can evaluate primitive types such as int, byte, short, char, and their corresponding wrapper classes.
        // It does not support evaluating long, float, double, or boolean types.
        // The switch only checks if the value matches exactly with the specified case; it doesn't evaluate conditions or logical operations.

        System.out.println("Insert the number between 0 and 2:");
        int numberA = sc.nextInt();
        switch (numberA) {
            case 0:
                System.out.println("The number is zero");
                break;
            case 1:
                System.out.println("The number is one");
                break;
            case 2:
                System.out.println("The number is two");
                break;
            default:
                System.out.println("The number is not in the range. Please insert the right value.");
        }

        System.out.println("Insert your credential name:");
        String credentialName = sc.next();
        switch (credentialName) {
            case "userAdmin":
                System.out.println("Welcome! " + credentialName);
                break;
            case "luigiLp":
                System.out.println("Hey, user " + credentialName);
                break;
            default:
                System.out.println("Your credential is not correct. Please insert the right value.");
        }
    }
}
