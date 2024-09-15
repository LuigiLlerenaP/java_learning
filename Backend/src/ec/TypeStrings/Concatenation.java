package ec.TypeStrings;

public class Concatenation {
    public static void main(String[] args) {
        String firstName = "Luigi";
        String lastName = "Llerena";
        String fullName ;
        int age = 24;
        int lenguajes = 2;
        fullName = firstName + lastName;

        System.out.println("fullName = " + fullName);
        System.out.println(fullName + age + lenguajes);
        System.out.println(age+lenguajes+fullName);

        System.out.println(firstName.concat("-").concat(lastName).concat("-").concat( String.valueOf(age)).concat("-").concat(Integer.toString(lenguajes)));
    }
}
