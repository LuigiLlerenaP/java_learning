package ec.Operators;

public class Precedence {
    public static void main(String[] args) {
        int numI = 14;
        int numJ = 8;
        int numK = 20;

        // Example 1: Basic arithmetic precedence
        double average = (numI + numJ + numK) / 3D;
        System.out.println("The average is " + average);  // Division has higher precedence than addition.

        // Example 2: Precedence of multiplication, addition, and subtraction
        int result1 = numI + numJ * numK - 10;
        System.out.println("Result of numI + numJ * numK - 10: " + result1);  // Multiplication happens first.

        // Example 3: Using parentheses to control precedence
        int result2 = (numI + numJ) * (numK - 10);
        System.out.println("Result of (numI + numJ) * (numK - 10): " + result2);  // Parentheses change the order of operations.

        // Example 4: Precedence of division and modulo
        int result3 = numK / numJ % numI;  // Division happens first, then modulo.
        System.out.println("Result of numK / numJ % numI: " + result3);

        // Example 5: Using logical AND (&&) and OR (||) with comparison operators
        boolean isNumKGreater = (numK > numI) && (numK > numJ);  // Comparison operators have higher precedence than logical AND.
        System.out.println("Is numK greater than both numI and numJ? " + isNumKGreater);

        boolean isNumKValid = (numK > numI) || (numK < numJ);  // Logical OR happens after comparison.
        System.out.println("Is numK greater than numI or less than numJ? " + isNumKValid);

        // Example 6: Unary operators precedence
        int numL = 10;
        int result4 = ++numL - numJ--;  // Pre-increment happens before subtraction, and post-decrement happens after.
        System.out.println("Result of ++numL - numJ--: " + result4 + ", numL: " + numL + ", numJ: " + numJ);

        // Example 7: Ternary operator precedence
        int result5 = (numI > numJ) ? numK : numI;
        System.out.println("Result of ternary (numI > numJ) ? numK : numI: " + result5);
    }
}
