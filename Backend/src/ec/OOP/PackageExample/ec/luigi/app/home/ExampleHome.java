package ec.OOP.PackageExample.ec.luigi.app.home;

import ec.OOP.PackageExample.ec.luigi.app.garden.Dog;

import static ec.OOP.PackageExample.ec.luigi.app.home.Person.greet;

public class ExampleHome {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        Dog dog = new Dog("Dog",4);

        String greet = greet();
    }
}
