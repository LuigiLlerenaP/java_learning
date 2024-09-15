package ec.Variables;

public class TypeConversion {
    public static void main(String[] args) {
        //String to primitive

        String numberStr = "50";
        int numberInt = Integer.parseInt(numberStr);
        System.out.println("numberInt = " + numberInt);

        String royalStr = "98765.45E-3";
        double royalDouble = Double.parseDouble(royalStr);
        System.out.println("royalDouble = " + royalDouble);

        String booleanStr = "false";
        boolean booleanB = Boolean.parseBoolean(booleanStr);
        System.out.println("booleanB = " + booleanB);


        int numberIntTwo = 100;
        System.out.println("The integer value is: " + numberIntTwo);

        String numberStrT = Integer.toString(numberIntTwo);
        System.out.println("Converted integer to string using Integer.toString(): " + numberStrT);

        String numberStrTwo = String.valueOf(numberIntTwo);
        System.out.println("Converted integer to string using String.valueOf(): " + numberStrTwo);

        String stringNumberWithOffset = String.valueOf(numberIntTwo + 10);
        System.out.println("String representation of integer plus 10: " + stringNumberWithOffset);

        double royalDoubleT = 1.22222;
        String realStr = Double.toString(royalDoubleT);
        System.out.println("Converted double to string using Double.toString(): " + realStr);

        String realStrTwo = String.valueOf(royalDoubleT);
        System.out.println("Converted double to string using String.valueOf(): " + realStrTwo);


        int iNumber = 1000;
        System.out.println("Original integer value (iNumber) = " + iNumber);

        short sNumber = (short) iNumber;
        System.out.println("Converted to short (sNumber) = " + sNumber);

        long lNumber = iNumber;
        System.out.println("Converted to long (lNumber) = " + lNumber);

        char cNumber = (char) iNumber;
        System.out.println("Converted to char (cNumber) = " + (int) cNumber + " (as int) or '" + cNumber + "' (as char)");
        
        float fNumber = (float) cNumber;
        System.out.println("fNumber = " + fNumber);

    }
}
