package ec.Variables;

public class SystemsNumerics {
    public static void main(String[] args) {
        int numberDecimal = 500;
        System.out.println("numberDecimal = " + numberDecimal);

        // Convert decimal to binary string
        System.out.println("numberDecimal to binary = " + Integer.toBinaryString(numberDecimal));

        // Binary literals in Java are written using the prefix 0b or 0B
        int numberBinary = 0b111110100;
        System.out.println("numberBinary = " + numberBinary);

        // Convert decimal to octal string
        System.out.println("numberDecimal to octal = " + Integer.toOctalString(numberDecimal));

        // Octal literals in Java are written using the prefix 0
        int numberOctal = 0764;
        System.out.println("numberOctal = " + numberOctal);

        // Convert decimal to hexadecimal string
        System.out.println("numberDecimal to hexadecimal = " + Integer.toHexString(numberDecimal));

        // Hexadecimal literals in Java are written using the prefix 0x or 0X
        int numberHex = 0x1F4;
        System.out.println("numberHex = " + numberHex);
    }
}
