package ec.OOP.Example;

public class Person {
    private String firstName;
    private String lastName;
    private String username;

    public Person(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    @Override
    public String toString() {
        return firstName + '\'' + lastName + '\'' + username + '\'' ;
    }
}
