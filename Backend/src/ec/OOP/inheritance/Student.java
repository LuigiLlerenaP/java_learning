package ec.OOP.inheritance;

import java.util.Map;

public class Student  extends  Person{
    private String institute;
    private Map<String, Double> scores;

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public Map<String, Double> getScores() {
        return scores;
    }

    public void setScores(Map<String, Double> scores) {
        this.scores = scores;
    }

    public void displayScores() {
        if (scores == null || scores.isEmpty()) {
            System.out.println("No scores available.");
            return;
        }

        System.out.println("Scores:");
        for (Map.Entry<String, Double> entry : scores.entrySet()) {
            System.out.println("Subject: " + entry.getKey() + " | Score: " + entry.getValue());
        }
    }
}
