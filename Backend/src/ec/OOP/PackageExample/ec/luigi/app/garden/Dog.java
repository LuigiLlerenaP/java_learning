package ec.OOP.PackageExample.ec.luigi.app.garden;

import ec.OOP.PackageExample.ec.luigi.app.home.Person;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String play(Person person) {
        return person.throwBall();
    }
}
