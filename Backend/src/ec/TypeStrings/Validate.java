package ec.TypeStrings;

public class Validate {
    public static void main(String[] args) {
        String firstName = null;
        if (firstName==null){
            System.out.println("The name is null");
            firstName ="";
        }
        if (firstName.length() == 0 || firstName.isEmpty()){
            System.out.println("The name is empty");
            firstName = " ";
        }
        if (firstName.isBlank()){
            System.out.println("The name is blank");
            firstName = "Luigi";
        }
        firstName = firstName.toLowerCase();
        System.out.println("firstName = " + firstName);
    }
}
