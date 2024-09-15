package ec.Variables;

public class PrimitiveRoyal {
    static float royalInitialValue;
    public static void main(String[] args) {
        // float  type
        float numberFloat = 9.223372036854775807F;
        System.out.println("numberFloat = " + numberFloat);

        float royalFloat = 2.12E3F;
        System.out.println("royalFloat = " + royalFloat);
        System.out.println("The float type is equal to: " + Float.BYTES + " bytes");
        System.out.println("The float type is equal to: " + Float.SIZE + " bits");
        System.out.println("Maximum value for float type: " + Float.MAX_VALUE);
        System.out.println("Minimum value for float type: " + Float.MIN_VALUE);

        //double type
        double royalDouble = 3.4028235E38;
        System.out.println("royalDouble = " + royalDouble);
        System.out.println("The double type is equal to: " + Double.BYTES + " bytes");
        System.out.println("The double type is equal to: " + Double.SIZE + " bits");
        System.out.println("Maximum value for double type: " + Double.MAX_VALUE);
        System.out.println("Minimum value for double type: " + Double.MIN_VALUE);
        
        
        //var float
        // Declare a floating-point variable using the `float` keyword
        // Append 'F' to indicate it's a float Otherwise, it's interpreted as a double by default.
        var varFlotante = 3.1316F;

        // Print the value of the variable
        System.out.println("varFlotante = " + varFlotante);
        // I can declare the variable when it's an attribute of my class, and if it's static,
        // I need to specify the similar context
        System.out.println("royalInitialValue = " + royalInitialValue);
    }
}
