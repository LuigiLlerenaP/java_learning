package ec.OOP.PackageExample.ec.luigi.app.garden;

import ec.OOP.PackageExample.ec.luigi.app.home.*;

import static ec.OOP.PackageExample.ec.luigi.app.home.ColorHair.BROWN;
import static ec.OOP.PackageExample.ec.luigi.app.home.Person.*;

public class ExamplePackage {
    public static void main(String[] args) {
        // We need to create the package using lowercase letters and separate words with a period.
        Person person = new Person ("Luigi","Ll");
        person.setColorHair(BROWN);
        person.setFirstName("John");
        String firstName = person.getFirstName();

        Dog dog = new Dog("Toby",7);

        System.out.println(firstName);
        String playing = dog.play(person);
        System.out.println(playing);
        String greet = greet();
        String genderFemale = GENDER_FEMALE;
        String genderMale = GENDER_MALE;
    }
}
