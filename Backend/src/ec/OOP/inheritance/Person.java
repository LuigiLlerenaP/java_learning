package ec.OOP.inheritance;

/**
 * Represents a person with basic attributes.
 * Demonstrates inheritance and encapsulation principles in Java.
 */
public class Person {
    // Private fields to enforce encapsulation
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private String email;

    // Protected field, accessible in child classes and within the same package
    protected String favoriteSport;

    /**
     * Default constructor.
     * Prints a message to indicate its invocation.
     */
    public Person() {
        System.out.println("----Inside Person constructor (no args)----");
    }

    /**
     * Constructor with firstName and lastName parameters.
     *
     * @param firstName the first name of the person
     * @param lastName  the last name of the person
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Constructor with firstName, lastName, and age parameters.
     *
     * @param firstName the first name of the person
     * @param lastName  the last name of the person
     * @param age       the age of the person
     */
    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }

    /**
     * Constructor with firstName, lastName, age, and gender parameters.
     *
     * @param firstName the first name of the person
     * @param lastName  the last name of the person
     * @param age       the age of the person
     * @param gender    the gender of the person
     */
    public Person(String firstName, String lastName, int age, String gender) {
        this(firstName, lastName, age);
        this.gender = gender;
    }

    // Getters and setters for encapsulated fields
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFavoriteSport() {
        return favoriteSport;
    }

    public void setFavoriteSport(String favoriteSport) {
        this.favoriteSport = favoriteSport;
    }

    /**
     * Returns the full name of the person.
     *
     * @return the full name as a concatenation of firstName and lastName
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * Converts the person object to a string representation.
     *
     * @return a string representation of the person
     */
    @Override
    public String toString() {
        return "Person {" +
                "address='" + address + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", favoriteSport='" + favoriteSport + '\'' +
                '}';
    }
}
