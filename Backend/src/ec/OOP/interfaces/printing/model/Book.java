package ec.OOP.interfaces.printing.model;

import java.util.ArrayList;
import java.util.List;

public class Book implements Printable {

    private List <Printable> pages;
    private  Person author;
    private String title;
    private Genre gender;

    public Book(Person author, String title, Genre gender) {
        this.author = author;
        this.title = title;
        this.gender = gender;
        this.pages = new ArrayList<Printable>();
    }
    public Book addSheet(Printable sheet) {
        pages.add(sheet);
        return this;
    }
    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(title).append("\n").
                append("Author: ").append(this.author).append("\n").
                append("Gender: ").append(gender).append("\n");
        for (Printable sheet : pages) {
            sb.append(sheet.print());
        }
        return sb.toString();
    }

}
