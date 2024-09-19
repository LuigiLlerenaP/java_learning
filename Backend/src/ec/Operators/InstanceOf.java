package ec.Operators;

public class InstanceOf {
    public static void main(String[] args) {

        String text = "Creating an object of the String class using a string literal";

        // Autoboxing an int value into an Integer wrapper class reference
        Integer number = 44;

        // Validate if 'text' is of type String
        Boolean isTextString = text instanceof String;
        System.out.println("Is 'text' a String? " + isTextString);

        // Validate if 'text' is of type Object
        Boolean isTextObject = text instanceof Object;
        System.out.println("Is 'text' an Object? " + isTextObject);

        // Validate if 'number' is of type Integer
        Boolean isNumberInteger = number instanceof Integer;
        System.out.println("Is 'number' an Integer? " + isNumberInteger);

        // Validate if 'number' is a subclass of Number
        Boolean isNumberInstanceOfNumber = number instanceof Number;
        System.out.println("Is 'number' an instance of Number? " + isNumberInstanceOfNumber);

        // Validate if 'decimal' is of type Number
        Double decimal = 455.45;
        Boolean isDecimalNumber = decimal instanceof Number;
        System.out.println("Is 'decimal' an instance of Number? " + isDecimalNumber);

        // Validate if 'isBoolean' is of type Boolean
        Boolean isBoolean = true;
        Boolean isBooleanType = isBoolean instanceof Boolean;
        System.out.println("Is 'isBoolean' a Boolean? " + isBooleanType);
    }
}
