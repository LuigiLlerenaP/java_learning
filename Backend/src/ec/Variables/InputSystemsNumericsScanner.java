package ec.Variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputSystemsNumericsScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert an integer value:");
        try {
            int numberDecimal = sc.nextInt();
            String message = "The integer you entered is : " + numberDecimal + "\n";
            message += "Number decimal to binary = "+Integer.toBinaryString(numberDecimal)+"\n";
            message += "Number decimal to octal = "+Integer.toOctalString(numberDecimal)+"\n";
            message += "Number decimal to hexadecimal ="+ Integer.toHexString(numberDecimal)+"\n";
            System.out.println(message);
        } catch (InputMismatchException e){
            System.err.println("Invalid input, please enter a valid value integer");
            main(args);
            System.exit(0);
        }
    }
}
