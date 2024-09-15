package ec.Operators;

public class Unary {
    public static void main(String[] args) {
        int numberA = -5;

        // Unary plus operator
        int numberB = +numberA; // Unary plus does not change the value of numberA, so numberB is -5
        System.out.println("numberB = " + numberB); // Output: numberB = -5

        // Unary minus operator
        int numberC = -numberA; // Unary minus changes the sign of numberA, so numberC is 5
        System.out.println("numberC = " + numberC); // Output: numberC = 5
    }
}
