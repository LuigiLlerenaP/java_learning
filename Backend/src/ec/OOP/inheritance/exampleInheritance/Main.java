package ec.OOP.inheritance.exampleInheritance;

import ec.OOP.inheritance.Person;
import ec.OOP.inheritance.Student;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Alice");
        person.setLastName("Johnson");
        person.setFavoriteSport("Soccer");
        System.out.println("Person Details: " + person);


        Person student = new Student();
        student.setFirstName("John");
        student.setLastName("Smith");


        if (student instanceof Student) {
            Student castedStudent = (Student) student;
            castedStudent.setInstitute("National Institute");
            System.out.println("Student Full Name: " + castedStudent.getFullName());
            System.out.println("Institute: " + castedStudent.getInstitute());
        }


        System.out.println("\nClass Hierarchy of Student:");
        Class<?> clazz = student.getClass();
        while (clazz.getSuperclass() != null) {
            System.out.println(clazz.getSimpleName() + " extends " + clazz.getSuperclass().getSimpleName());
            clazz = clazz.getSuperclass();
        }
    }
}
