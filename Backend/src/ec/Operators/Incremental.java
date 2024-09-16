package ec.Operators;

public class Incremental {
    public static void main(String[] args) {
        int numberA = 1;
        int numberB = 5;

        // Pre-Increment
        int numberC = ++numberA; // numberA is incremented to 2, and numberC is set to 2.
        System.out.println("numberC (Pre-Increment) = " + numberC); // Output: numberC = 2

        // Post-Increment
        int numberD = numberA++; // numberD is set to the current value of numberA (2), then numberA is incremented to 3.
        System.out.println("numberD (Post-Increment) = " + numberD); // Output: numberD = 2
        System.out.println("numberA after Post-Increment = " + numberA); // Output: numberA = 3



        // Pre-Decrement
        int numberE = --numberB; // numberB is decremented to 4, and numberE is set to 4.
        System.out.println("numberE (Pre-Decrement) = " + numberE); // Output: numberE = 4

        // Post-Decrement
        int numberF = numberE--; // numberF is set to the current value of numberE (4), then numberE is decremented to 3.
        System.out.println("numberF (Post-Decrement) = " + numberF); // Output: numberF = 4
        System.out.println("numberE after Post-Decrement = " + numberE); // Output: numberE = 3
    }
}
