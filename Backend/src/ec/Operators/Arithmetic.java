package ec.Operators;

import javax.swing.*;

public class Arithmetic {
    public static void main(String[] args) {
        // Initialize numbers
        int numberA = 3;
        int numberB = 2;
        int addition, subtraction, multiplication, remainder;
        double division;

        // Display initial values
        System.out.println("numberA = " + numberA);
        System.out.println("numberB = " + numberB);
        System.out.println("///////////////////////");

        // Perform and display arithmetic operations
        addition = numberA + numberB;
        System.out.println("Addition " + addition);

        subtraction = numberA - numberB;
        System.out.println("Subtraction "+ subtraction);

        multiplication = numberA * numberB;
        System.out.println("Multiplication "+ multiplication);

        division = (double) numberA / numberB;
        System.out.println("Division "+ division);

        remainder = numberA % numberB;
        System.out.println("Remainder "+ remainder);

        ///
        int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number:"));
        String numberPart = (num%2 == 0)?"Even":"Odd";
        System.out.println("The number " + num + " is " + numberPart);

 

    }
}
