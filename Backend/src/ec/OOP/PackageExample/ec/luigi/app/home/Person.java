package ec.OOP.PackageExample.ec.luigi.app.home;

public class Person {
    private String firstName;
    private String lastName;
    private ColorHair colorHair;

    public static final String GENDER_MALE = "Male";
    public static final String GENDER_FEMALE = "Female";


    public Person() {
    }
    public Person(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ColorHair getColorHair() {
        return colorHair;
    }

    public void setColorHair(ColorHair colorHair) {
        this.colorHair = colorHair;
    }

    public String throwBall() {
        return "Throws the ball to the dog.";
    }

    public static String greet() {
        return "Hello, what's up!";
    }
}
