package ec.Operators;

public class InstanceOfGenerics {
    public static void main(String[] args) {
        Object text = "All classes in Java extend from the superclass Object";
        Number numObject = 11;

        // Check if 'text' is of type Integer
        Boolean isTextTypeInteger = text instanceof Integer;
        System.out.println("Is 'text' of type Integer? " + isTextTypeInteger);

        // Check if 'numObject' is of type Integer
        Boolean isTypeInteger = numObject instanceof Integer;
        System.out.println("Is 'numObject' of type Integer? " + isTypeInteger);

        // Check if 'numObject' is of type Double
        Boolean isTypeDouble = numObject instanceof Double;
        System.out.println("Is 'numObject' of type Double? " + isTypeDouble);

        // Check if 'numObject' is of type Long
        Boolean isTypeLong = numObject instanceof Long;
        System.out.println("Is 'numObject' of type Long? " + isTypeLong);

        Integer numValueOF = Integer.valueOf(9);
        Float floatValueOF = Float.valueOf(33.3F);
        System.out.println("Create the object way explicite"+ numValueOF + floatValueOF);


    }
}
