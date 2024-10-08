package ec.Wrapper;

public class BooleanWrapper {
    public static void main(String[] args) {
        Integer numOne, numTwo;
        numOne = 1;
        numTwo = 2;

        // Comparing two Integer objects (autounboxing happens here)
        boolean primBoolean = numOne > numTwo; // This will be false

        // Creating a Boolean object from a primitive boolean (boxing)
        Boolean objectBoolean = Boolean.valueOf(primBoolean);

        // Creating a Boolean object from a String ("false")
        Boolean objectBooleanTwo = Boolean.valueOf("false");

        // Autoboxing: Creating a Boolean object using a boolean literal
        Boolean objectBooleanThree = false;

        // Output the results
        System.out.println("primBoolean = " + primBoolean); // false
        System.out.println("objectBoolean = " + objectBoolean); // false
        System.out.println("objectBooleanTwo = " + objectBooleanTwo); // false

        // Compare using == (checks if both their value are teh same only in Boolean object)
        System.out.println("Compare two object booleans using ==: " + (objectBoolean == objectBooleanTwo)); // true

        // Compare using .equals() (checks if their values are the same)
        System.out.println("Compare using equals method: " + objectBooleanTwo.equals(objectBooleanThree)); // true

        // Return the primitive value using .booleanValue() (unboxing)
        boolean primitiveBooleanTwo = objectBooleanTwo.booleanValue();
        System.out.println("primitiveBooleanTwo = " + primitiveBooleanTwo); // false
    }
}
