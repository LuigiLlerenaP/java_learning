package ec.TypeStrings;

public class Strings {
    public static void main(String[] args) {
        String objectReferentLiteral = "It's an object, Java creates the object and the instance automatically.";
        System.out.println("objectReferentLiteral = " + objectReferentLiteral);

        String objectReferentExplicit = new String("It's a String object, created explicitly.");
        System.out.println("objectReferentExplicit = " + objectReferentExplicit);

        String name = "Luigi";
        String lastName = "Llerena";
        System.out.println(name.concat("-").concat(lastName));

        System.out.println("Is it the same object? :" + (name == lastName));
        System.out.println("Is it the same value? : " + name.equals(lastName));
        System.out.println("Is it the same value, ignoring case? : " + name.equalsIgnoreCase(lastName));
        System.out.println("The length of the 'name' string is: " + name.length());

        String carOne = "Ford";
        String carTwo = "Ford";
        System.out.println("When I create two literal strings  with the same value, " +
                "Java doesn't create different objects; it creates one object, and both variables " +
                "refer to the same object.");
        System.out.println("Is it the same object and reference? : " + (carOne == carTwo));

        String a ="Lu";
        String b = new String("Lu");
        System.out.println("If I create two strings in different ways (literal or explicit), " +
                "they will be different objects with different references, " +
                "even if they have the same value.");

        System.out.println("Is it the same object and reference? : " + (a == b ));
    }
}
