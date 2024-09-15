package ec.Variables;

public class PrimitiveCharacters {
    public static void main(String[] args) {
        char character = 'A';
        System.out.println("character = " + character);

        // Using Unicode to represent the '@' symbol
        char sign = '\u0040';

        // Using decimal ASCII value to represent the '@' symbol
        char signDecimal = 64;

        // Directly using the '@' symbol
        char signSymbol = '@';

        // Using var to infer the type from the assigned value
        var varSign = '@';

        // If var is assigned a number like 64, it is treated as an integer, not a character
        var sigNumber = 64;

        System.out.println("signDecimal = " + signDecimal);
        System.out.println("sign (from Unicode) = " + sign);

        // Comparing the sign and signDecimal values
        System.out.println("Is sign equal to signDecimal? " + (sign == signDecimal));

        // Assigning signSymbol to sign and displaying it
        System.out.println("Assigning signSymbol to sign: " + (signSymbol = sign));

        // Displaying the implicit character value stored in varSign
        System.out.println("varSign = " + varSign);

        System.out.println("sigNumber = " + sigNumber);

        // Displaying characteristics of the char type
        System.out.println("The char type is equal to: " + Character.BYTES + " bytes");
        System.out.println("The char type is equal to: " + Character.SIZE + " bits");
        System.out.println("Maximum value for char type: " + Character.MAX_VALUE);
        System.out.println("Minimum value for char type: " + Character.MIN_VALUE);

        // Special characters
        char space = '\u0020';     // Unicode for space character
        char backSpace = '\b';     // Backspace character
        char tabulation = '\t';    // Tab character
        char newLine = '\n';       // New line character
        char returnCar = '\r';     // Carriage return character

        // Using the variables in print statements
        System.out.println("This" + space + "is" + space + "a" + space + "sentence.");  // Spaces between words
        System.out.println("Hello," + backSpace + " World!");  // Backspace removes the comma
        System.out.println("Column1" + tabulation + "Column2"); // Tab creates space between columns
        System.out.println("First Line" + newLine + "Second Line"); // New line between lines
        System.out.println("First Part" + returnCar + "Second Part"); // Carriage return moves to the beginning of the line


    }
}
