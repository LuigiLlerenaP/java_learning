package ec.Variables;

public class PrimitiveBoolean {
    public static void main(String[] args) {
        // Boolean type: literal assignment
        boolean isLogicalLiteral = true;
        System.out.println("isLogicalLiteral = " + isLogicalLiteral);

        // Boolean type: reference assignment (less common, implicit conversion)
        boolean isLogicalReference = Boolean.FALSE; // Boolean.FALSE is implicitly converted to 'false'
        System.out.println("isLogicalReference = " + isLogicalReference);

        // Demonstrating double and float types with scientific notation
        double numberDouble = 98765.43e-3; // 98.76543
        float numberFloat = 12345E2F; // 1234500.0

        // Comparing double and float values
        boolean isGreater = (numberDouble > numberFloat); // True or false based on comparison
        System.out.println("Is numberDouble greater than numberFloat? = " + isGreater);

        // Checking if the expression (3 - 2) equals 1
        boolean isEqual = (3 - 2 == 1);
        System.out.println("Is 3 - 2 equal to 1? = " + isEqual);
    }
}
