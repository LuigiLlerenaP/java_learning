package ec.OOP.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setFirstName("Luigi");
        s1.setLastName("Doe");
        s1.setInstitute("Institute of Technology");
        System.out.println("Student Full Name: " + s1.getFullName());
        System.out.println("Institute: " + s1.getInstitute());
        System.out.println("Student Details: " + s1);


        Person p1 = new Person();
        p1.setFirstName("John");
        p1.setLastName("Doe");
        p1.setFavoriteSport("Soccer");
        System.out.println("\nPerson Full Name: " + p1.getFullName());
        System.out.println("Favorite Sport: " + p1.getFavoriteSport());
        System.out.println("Person Details: " + p1);


        StudentInternational s2 = new StudentInternational();
        s2.setFirstName("Alice");
        s2.setLastName("Smith");
        s2.setCountry("Canada");
        s2.setPeriod("2023-2024");
        System.out.println("\nInternational Student Full Name: " + s2.getFullName());
        System.out.println("Country: " + s2.getCountry());
        System.out.println("Academic Period: " + s2.getPeriod());
        System.out.println("International Student Details: " + s2);

        System.out.println("\nClass Hierarchy of StudentInternational:");
        Class<?> clase = s2.getClass();
        while (clase.getSuperclass() != null) {
            String child = clase.getSimpleName();
            String parent = clase.getSuperclass().getSimpleName();
            System.out.println(child + " extends " + parent);
            clase = clase.getSuperclass();
        }
    }
}
