package ec.OOP.interfaces.printing.model;

public class Report extends  Sheet implements Printable {
    private  Person author;
    private  Person reviewer;

    public Report(Person author, Person reviewer,String content) {
        super(content);
        this.author = author;
        this.reviewer = reviewer;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Report written by:").append(this.author).append("\n")
                .append("Reviewer: ").append(this.reviewer).append("\n")
                .append("Content:").append(content).append("\n");
        return sb.toString();
    }
}
