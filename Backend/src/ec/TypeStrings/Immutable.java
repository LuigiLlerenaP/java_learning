package ec.TypeStrings;

public class Immutable {
    public static void main(String[] args) {
        String firstName = "Luigi";
        String lastName = "Llerena";
        String profession = "Engineer";
        String fullName = firstName.concat(lastName);
        String information = "User -> ";

        information = information.transform((inf) -> {
            return inf.concat("").concat(fullName).concat(" - ").concat(profession).concat(")");
        });

        System.out.println("information = " + information);
        String informationM =information.replace("a","A");
        System.out.println("information = " + informationM);
    }
}
