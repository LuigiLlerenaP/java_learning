package ec.Wrapper;

public class OperatorsRelations {
    public static void main(String[] args) {
        // Explicit: Creating an Integer object using valueOf() method
        Integer num1 = Integer.valueOf(127);

        // Implicit: Autoboxing, assigning an int to an Integer object
        Integer num2 = 127;

        // Both of them are objects that wrap a primitive int value

        // Compare object references (will likely return false)
        System.out.println("Are they the same object? " + (num1 == num2));

        // Compare actual values (will return true if values are equal)
        System.out.println("Do they have the same value? " + num1.equals(num2));

        // Compare actual primitive values by casting to int
        System.out.println("Do they have the same value (using intValue)? " + (num1.intValue() == num2.intValue()));

        //Auto an boxing
        boolean condOne = num1 > num2;
        System.out.println("condOne = " + condOne);

        //

    }
}
