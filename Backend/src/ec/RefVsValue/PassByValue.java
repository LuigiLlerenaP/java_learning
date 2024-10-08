package ec.RefVsValue;

public class PassByValue {
    public static void main(String[] args) {
        // Initialize primitive and wrapper type variables
        int primitiveValue = 10;
        Integer wrapperValue = 100;

        System.out.printf("Start method main with primitiveValue = %d %n", primitiveValue);
        System.out.printf("Start method main with wrapperValue = %d %n", wrapperValue);
        test(primitiveValue, wrapperValue);
        System.out.printf("End method main with the value primitiveValue = %d %n", primitiveValue);
        // The original wrapperValue remains unchanged due to immutability
        // I pass the reference of the object, but in Java, these objects are immutable
        // We create a new object and return the new value with its reference
        System.out.printf("End method main with the value wrapperValue = %d %n", wrapperValue);
    }

    public static void test(int primitiveValue, Integer wrapperValue) {
        System.out.printf("Start method test with primitiveValue (passed by value) = %d %n", primitiveValue);
        System.out.printf("Start method test with wrapperValue (passed by reference) = %d %n", wrapperValue);

        // Modify the values
        primitiveValue = 35; // Modifies the primitive copy
        wrapperValue = 50;   // Modifies the local reference to a new Integer object

        System.out.printf("The new value of primitiveValue = %d %n", primitiveValue);
        System.out.printf("The new value of wrapperValue = %d %n", wrapperValue);
    }
}
