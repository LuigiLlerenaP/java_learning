package ec.OOP.interfaces.printing;

import ec.OOP.interfaces.printing.model.*;
import static ec.OOP.interfaces.printing.model.Genre.PROGRAMMING;
import static ec.OOP.interfaces.printing.model.Printable.*;

public class ExamplePrinting {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Work Summary", new Person("Luigi","Llerena"), "Software");
        cv.addExperience("Java")
                .addExperience("C#")
                .addExperience("PHP")
                .addExperience("SQL");

        Report report = new Report(new Person("Martin","Fowler"), new Person("James",""), "Study Microsystems");


        Book book = new Book(new Person("Erich","Gamma"), "Design Patterns: Elements of Reusable Object-Oriented Software", PROGRAMMING);
        book.addSheet(new Page("Singleton Pattern"))
                .addSheet(new Page("Factory Pattern"))
                .addSheet(new Page("Facade Pattern"));


        print(cv);
        print(report);
        print(book);
        System.out.println(VALUE_DEFAULT);
        System.out.println();

        print(new Printable() {
            @Override
            public String print() {
                return "Printing a object generic of class unanimous";
            }
        });
    }


}
