package ec.Wrapper;

public class WInteger {
    public static void main(String[] args) {
        int numberP = 32768;

        // Casting to class reference
        Integer intObjP = Integer.valueOf(numberP); // Explicit boxing
        Integer intObj = Integer.valueOf(123);      // Explicit boxing
        Integer intObject = 1234;                   // Implicit auto-boxing
        Integer intObjectP = numberP;               // Implicit auto-boxing

        // Sum of two Integer objects with auto-unboxing
        System.out.println(intObject + intObj);

        int numImplicit = intObj;
        System.out.println("numImplicit = " + numImplicit);
        int numExplicit = intObjectP.intValue();
        System.out.println("numExplicit = " + numExplicit);

        // Converting a string to an Integer using Integer.valueOf()
        String valueTVLcd = "67000";
        Integer value = Integer.valueOf(valueTVLcd);
        System.out.println("Converted string to Integer: value = " + value);

        // Loss of information: casting Integer to Short (may result in overflow)
        Short shortObject = intObjectP.shortValue();
        System.out.println("Converted Integer to Short: shortObject = " + shortObject);
        // Convert Integer to Byte, illustrating potential data loss
        Byte byteObject = intObject.byteValue();
        System.out.println("Converted Integer to Byte: byteObject = " + byteObject); // Likely to display an unexpected value


        Long longObject = intObject.longValue();
        System.out.println("Converted Integer to long longObject = " + longObject);
    }
}
