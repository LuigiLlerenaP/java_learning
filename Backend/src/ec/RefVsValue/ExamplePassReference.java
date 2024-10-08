package ec.RefVsValue;

class Person {
    private String firstName;

    // Constructor that initializes the person's first name
    public Person(String firstName) {
        this.firstName = firstName;
    }

    // Setter method for first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter method for first name
    public String getFirstName() {
        return this.firstName;
    }
}

public class ExamplePassReference {
    public static void main(String[] args) {
        // Instantiate the class using the constructor with the 'new' operator
        Person person = new Person("Anthony");
        person.setFirstName("Luis");
        System.out.println("Person's first name: " + person.getFirstName());

        // Pass the object reference and modify the person's first name
        test(person, "Maria");
        System.out.println("Person's first name after test: " + person.getFirstName());
        System.out.println("End main");
    }

    // Method that modifies the first name by reference
    public static void test(Person person, String firstName) {
        System.out.println("Start the test method");
        person.setFirstName(firstName);
        System.out.println("End the method");
    }
}


