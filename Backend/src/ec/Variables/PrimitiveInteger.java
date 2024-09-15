package ec.Variables;

public class PrimitiveInteger {
    public static void main(String[] args) {
        // Data type representing a value

        // byte type
        byte numberByte = 127; // Maximum value allowed for byte type
        System.out.println("numberByte = " + numberByte);
        System.out.println("The byte type is equal to: " + Byte.BYTES + " bytes");
        System.out.println("The byte type is equal to: " + Byte.SIZE + " bits");
        System.out.println("Maximum value for byte type: " + Byte.MAX_VALUE);
        System.out.println("Minimum value for byte type: " + Byte.MIN_VALUE);

        // short type
        short numberShort = 32767; // Maximum value allowed for short type
        System.out.println("numberShort = " + numberShort);
        System.out.println("The short type is equal to: " + Short.BYTES + " bytes");
        System.out.println("The short type is equal to: " + Short.SIZE + " bits");
        System.out.println("Maximum value for short type: " + Short.MAX_VALUE);
        System.out.println("Minimum value for short type: " + Short.MIN_VALUE);

        // int type
        int numberInt = 2147483647; // Maximum value allowed for int type
        System.out.println("numberInt = " + numberInt);
        System.out.println("The int type is equal to: " + Integer.BYTES + " bytes");
        System.out.println("The int type is equal to: " + Integer.SIZE + " bits");
        System.out.println("Maximum value for int type: " + Integer.MAX_VALUE);
        System.out.println("Minimum value for int type: " + Integer.MIN_VALUE);

        // long type (use 'L' at the end to specify it's a long literal)
        long numberLong = 9223372036854775807L; // Maximum value allowed for long type
        System.out.println("numberLong = " + numberLong);
        System.out.println("The long type is equal to: " + Long.BYTES + " bytes");
        System.out.println("The long type is equal to: " + Long.SIZE + " bits");
        System.out.println("Maximum value for long type: " + Long.MAX_VALUE);
        System.out.println("Minimum value for long type: " + Long.MIN_VALUE);
        
        //var type
        // The type is inferred as int because the assigned value is an integer.
        // If you append 'L' or 'l' at the end, it will be inferred as a long.
        var numberVar = 127;
        var numberVarTow = 1233F;
        System.out.println("numberVar = " + numberVar);
        System.out.println("numberVarTow = " + numberVarTow);


    
    }
}

