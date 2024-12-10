package ec.OOP.inheritance;

import java.util.HashMap;
import java.util.Map;

public class InheritanceMainTwo {
    public static void main(String[] args) {
        System.out.println("----- Create instance of class student ---------");
        Map<String, Double> subjectScores = new HashMap<>();
        subjectScores.put("Matemáticas", 95.5);
        subjectScores.put("Historia", 89.0);
        subjectScores.put("Ciencias", 92.0);
        Student luigi = new Student("Luigi", "Llerena", 24, "Cato");
        luigi.setGender("M");
        luigi.setPhone("095885380");
        luigi.setEmail("luigi@gmail.com");
        luigi.setAddress("San Isidro");
        luigi.favoriteSport = "Soccer"; // Protected
        luigi.setScores(subjectScores);
        System.out.println(luigi);

        System.out.println("----- Create instance of class teacher ---------");
        Teacher luis = new Teacher("Luis", "LastName", "Math", "Sciences");
        luis.setGender("M");
        luis.setPhone("095885380");
        luis.setEmail("luis@gmail.com");
        luis.setAddress("San Isidro");
        System.out.println(luis);

        System.out.println("----- Create instance of class International ---------");
        StudentInternational anthony = new StudentInternational("Anthony", "Llerena", "Ecuador", "6 months", LanguageLevel.GOOD);
        anthony.setGender("M");
        anthony.setPhone("095885380");
        anthony.setEmail("anthony@gmail.com");
        anthony.setAddress("San Isidro");
        anthony.setScores(subjectScores);
        System.out.println(anthony);

        System.out.println("----- Impair Results ---------");
        System.out.println(impair(luis));
        System.out.println(impair(luigi));
        System.out.println(impair(anthony));

        //Great
        System.out.println("----- Grate ---------");
        System.out.println(luigi.greats());
        System.out.println("----- Grate ---------");
        System.out.println(luis.greats());
        System.out.println("----- Grate ---------");
        System.out.println(anthony.greats());

        System.out.println("----- Calculate average ---------");
        System.out.println(luigi.averageScores());
        System.out.println("----- Calculate average ---------");
        System.out.println(anthony.averageScores());
    }

    /**
     * Generates a detailed description of the person object and handles specific types.
     */
    public static String impair(Person person) {
        StringBuilder dataObject = new StringBuilder();

        // Common attributes
        dataObject.append("Person Details:\n")
                .append("Name: ").append(person.getFullName()).append("\n")
                .append("Age: ").append(person.getAge()).append("\n")
                .append("Gender: ").append(person.getGender()).append("\n")
                .append("Phone: ").append(person.getPhone()).append("\n");

        // Check if it's a StudentInternational first (most specific case)
        if (person instanceof StudentInternational) {
            StudentInternational international = (StudentInternational) person;
            dataObject.append("\n--- Student Details ---\n")
                    .append("Institute: ").append(international.getInstitute()).append("\n")
                    .append("\n--- International Student Details ---\n")
                    .append("Country: ").append(international.getCountry()).append("\n")
                    .append("Period: ").append(international.getPeriod()).append("\n")
                    .append("Language Level: ").append(international.getLanguageLevel()).append("\n");
            return dataObject.toString(); // Return early for StudentInternational
        }

        // Check if it's a Student
        if (person instanceof Student) {
            Student student = (Student) person;
            dataObject.append("\n--- Student Details ---\n")
                    .append("Institute: ").append(student.getInstitute()).append("\n");
            return dataObject.toString(); // Return early for Student
        }

        // Check if it's a Teacher
        if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            dataObject.append("\n--- Teacher Details ---\n")
                    .append("Department: ").append(teacher.getDepartment()).append("\n")
                    .append("Signature: ").append(teacher.getSignature()).append("\n");
            return dataObject.toString(); // Return early for Teacher
        }

        // Default return for a Person without additional details
        return dataObject.toString();
    }

}
