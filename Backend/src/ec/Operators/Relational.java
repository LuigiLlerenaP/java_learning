package ec.Operators;

public class Relational {
    public static void main(String[] args) {
        // Using float and double types
        float numA = 4.0F;
        double numB = 5.0;
        float numC = 133E-1F; // 133 * 10^-1 = 13.3
        double numD = 2.44E2; // 2.44 * 10^2 = 244.0
        boolean isN = false;

        // Relational Operations
        boolean isEquals = numA == numB; // Checks if numA is equal to numB
        boolean isDistinct = numA != numB; // Checks if numA is not equal to numB
        boolean isGreater = numC > numB; // Checks if numC is greater than numB
        boolean isGreaterAndEquals = numA >= numB; // Checks if numA is greater than or equal to numB
        boolean isLess = numA < numD; // Checks if numA is less than numD
        boolean isLessAndEquals = numC <= numD; // Checks if numC is less than or equal to numD

        // Logical Operation
        boolean notFalse = !isN; // Negates the value of isN

        // Output results
        System.out.println("numA == numB: " + isEquals); // false
        System.out.println("numA != numB: " + isDistinct); // true
        System.out.println("numC > numB: " + isGreater); // true
        System.out.println("numA >= numB: " + isGreaterAndEquals); // false
        System.out.println("numA < numD: " + isLess); // true
        System.out.println("numC <= numD: " + isLessAndEquals); // true
        System.out.println("!isN: " + notFalse); // true
        System.out.println("numC: " + numC); // 13.3
        System.out.println("numD: " + numD); // 244.0
    }
}
