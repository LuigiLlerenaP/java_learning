package ec.OOP.inheritance;

import java.util.Map;

public class Student extends Person {
    private String institute;
    private Map<String, Double> scores;

    /**
     * Default constructor.
     * Invokes the parent class constructor.
     */
    public Student() {
        super();
        System.out.println("----Inside Student constructor (no args)----");
    }

    /**
     * Constructor with firstName and lastName.
     */
    public Student(String firstName, String lastName) {
        super(firstName, lastName); // Invoke the parent constructor
    }

    /**
     * Constructor with firstName, lastName, and age.
     */
    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    /**
     * Constructor with firstName, lastName, and institute.
     */
    public Student(String firstName, String lastName, String institute) {
        this(firstName, lastName);
        this.institute = institute;
    }

    /**
     * Constructor with firstName, lastName, age, and institute.
     */
    public Student(String firstName, String lastName, int age, String institute) {
        this(firstName, lastName, age);
        this.institute = institute;
    }

    /**
     * Constructor with all attributes.
     */
    public Student(String firstName, String lastName, int age, String institute, Map<String, Double> scores) {
        this(firstName, lastName, age, institute);
        this.scores = scores;
    }

    // Getter and setter for institute
    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    // Getter and setter for scores
    public Map<String, Double> getScores() {
        return scores;
    }

    public void setScores(Map<String, Double> scores) {
        if (scores == null) {
            throw new IllegalArgumentException("Scores cannot be null");
        }
        this.scores = scores;
    }

    /**
     * Displays all scores for the student.
     */
    public void displayScores() {
        if (scores == null || scores.isEmpty()) {
            System.out.println("No scores available.");
            return;
        }

        System.out.println("Scores:");
        scores.forEach((subject, score) ->
                System.out.printf("Subject: %-15s | Score: %.2f%n", subject, score)
        );
    }

    /**
     * Overrides toString to provide a detailed representation of the student.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n")
                .append("Institute: ").append(institute).append("\n");

        if (scores != null && !scores.isEmpty()) {
            sb.append("Scores:\n");
            scores.forEach((subject, score) ->
                    sb.append("  - ").append(subject).append(": ").append(score).append("\n")
            );
        } else {
            sb.append("Scores: No scores available.\n");
        }

        return sb.toString();
    }
}
