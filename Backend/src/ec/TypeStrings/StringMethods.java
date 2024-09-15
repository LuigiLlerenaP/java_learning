package ec.TypeStrings;

public class StringMethods {
    public static void main(String[] args) {
        String firstName = "Luigi";

        System.out.println("How many characters does it have? " + firstName.length());

        System.out.println("In lowercase: " + firstName.toLowerCase());

        System.out.println("In uppercase: " + firstName.toUpperCase());

        System.out.println("Is it the same as 'Luigi'? " + firstName.equals("Luigi"));

        System.out.println("Is it the same as 'luigi' ignoring case? " + firstName.equalsIgnoreCase("luigi"));

        System.out.println("Is it the same as 'Luigi'? " + firstName.compareTo("Luigi"));

        System.out.println("What is the char in the index 0 of this string: " + firstName.charAt(0));

        System.out.println("What is the last character: " + firstName.charAt(firstName.length() - 1));

        System.out.println("Substring from index 1: " + firstName.substring(1));

        System.out.println("Substring from index 1 to 3: " + firstName.substring(1, 3));

        System.out.println("Last 2 characters: " + firstName.substring(firstName.length() - 2));

        System.out.println("Does it start with 'Lu'? " + firstName.startsWith("Lu"));

        System.out.println("Does it end with 'i'? " + firstName.endsWith("i"));

        System.out.println("///////////////////////////||||||||||||||||||||||");
        String tongueTwisters ="TongueTwisters";
        System.out.println("tongueTwisters.replace('o','P') = " + tongueTwisters.replace('o','P'));
        System.out.println("tongueTwisters = " + tongueTwisters.indexOf('o'));
        System.out.println("tongueTwisters.lastIndexOf('r') = " + tongueTwisters.lastIndexOf('r'));
        System.out.println("tongueTwisters.startsWith(\"tong\") = " + tongueTwisters.startsWith("tong"));
        System.out.println("tongueTwisters.endsWith(\"ters\") = " + tongueTwisters.endsWith("ters"));

        System.out.println("///////////////////////////||||||||||||||||||||||");
        String lastName = " Llerena ";
        System.out.println("lastName.trim() = " + lastName.trim());
    }
}
