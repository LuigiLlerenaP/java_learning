package ec.Operators;

public class Logical {
    public static void main(String[] args) {
        float numA = 4.0F;
        double numB = 5.0;
        float numC = 133E-1F; // 133 * 10^-1 = 13.3
        double numD = 2.44E2; // 2.44 * 10^2 = 244.0

        // Using logical AND (&&) and logical OR (||) operators
        // Checks if both conditions are true
        boolean isBothTrue = (numC < numD) && (numA > numB);
        // Checks if at least one condition is true
        boolean isOneTrue = (numC < numD) || (numA <= numC);

        // Using bitwise AND (&) and bitwise OR (|) operators
        // Evaluates both sides regardless of the first condition
        boolean areBoth = numA <= numC & numB > numA;
        // Evaluates both sides regardless of the first condition
        boolean areOne = numA > numD | numB < numC;
        
        // Demonstrating operator precedence: () has the highest priority, followed by !, &&, and ||
        boolean isPrecedence = !(numA == numB) && numC != numD || numA < numC;
        System.out.println("isPrecedence = " + isPrecedence);

        // Output results
        System.out.println("isBothTrue (Logical AND): " + isBothTrue); // false
        System.out.println("isOneTrue (Logical OR): " + isOneTrue);    // true
        System.out.println("areBoth (Bitwise AND): " + areBoth);       // true
        System.out.println("areOne (Bitwise OR): " + areOne);          // true
    }
}
