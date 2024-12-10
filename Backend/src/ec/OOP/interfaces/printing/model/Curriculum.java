package ec.OOP.interfaces.printing.model;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Sheet implements Printable {
    private Person person;
    private String career;
    private List<String> experiences;

    public Curriculum(String content , Person person, String career) {
        super(content);
        this.person = person;
        this.career = career;
        this.experiences = new ArrayList<>();
    }
    public Curriculum addExperience(String experience){
        experiences.add(experience);
        return this;
    }



    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.person).append("\n")
                .append("Career: ").append(this.career).append("\n")
                .append("Experiences: ");
        for (String experience : experiences) {
            sb.append(".)").append(experience).append("\t");
        }
        return sb.toString();
    }
}
