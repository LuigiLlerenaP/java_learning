package ec.Arrays;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class ExampleArrayScores {
    private static final int MAX_SCORES = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] mathScores = addScores("Math", sc);
        double[] englishScores = addScores("English", sc);

        double avgMath = calculateAverage(mathScores);
        double avgEnglish = calculateAverage(englishScores);

        System.out.printf("The average Math score is %.2f %n", avgMath);
        System.out.printf("The average English score is %.2f %n", avgEnglish);

        double overallAverage = calculateOverallAverage(mathScores, englishScores);
        System.out.printf("The overall average score is %.2f %n", overallAverage);

        displayStudentScore(sc, mathScores, englishScores);
    }


    public static double[] addScores(String subject, Scanner sc) {
        int len = promptForArrayLength(subject, sc);
        double[] scores = new double[len];

        for (int i = 0; i < len; i++) {
            scores[i] = promptForScore(subject, sc, i + 1);
        }
        return scores;
    }


    public static int promptForArrayLength(String subject, Scanner sc) {
        int len = 0;
        while (true) {
            System.out.printf("Enter the number of scores (1-%d) for %s: ", MAX_SCORES, subject);
            try {
                len = sc.nextInt();
                if (!(len < 1 || len > MAX_SCORES)) {
                    break;
                }
                System.out.println("Invalid number of scores. Try again.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        }
        return len;
    }


    public static double promptForScore(String subject, Scanner sc, int attempt) {
        double score = 0;
        while (true) {
            System.out.printf("Enter score %d for %s (0-10): ", attempt, subject);
            try {
                score = sc.nextDouble();
                if (!(score < 0 || score > 10)) {
                    break;
                }
                System.out.println("Invalid score. Must be between 0 and 10. Try again.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid score.");
                sc.next();
            }
        }
        return score;
    }


    public static double calculateAverage(double[] scores) {
        double sum = sumArray(scores);
        return (sum / scores.length);
    }

    public static double calculateOverallAverage(double[]... scoreArrays) {
        double totalSum = 0;
        int totalCount = 0;

        for (double[] scores : scoreArrays) {
            totalSum += sumArray(scores);
            totalCount += scores.length;
        }

        return totalSum / totalCount;
    }


    public static double sumArray(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum;
    }


    public static void displayStudentScore(Scanner sc, double[] mathScores, double[] englishScores) {
        System.out.println("Which subject do you want to check (Math/English)?");
        String subjectChoice = sc.next();

        double[] selectedScores = switch (subjectChoice) {
            case "Math" -> mathScores;
            case "English" -> englishScores;
            default -> null;
        };

        if (selectedScores == null) {
            System.out.println("Invalid subject choice.");
            return;
        }

        System.out.println("Enter the student ID (0-" + (selectedScores.length - 1) + "):");
        Optional<Double> score = getScoreById(sc, selectedScores);

        score.ifPresentOrElse(
                s -> System.out.printf("The score for the selected student is %.2f%n", s),
                () -> System.out.println("Invalid student ID.")
        );
    }


    public static Optional<Double> getScoreById(Scanner sc, double[] scores) {
        try {
            int id = sc.nextInt();
            if (!(id >= 0 && id < scores.length)) {
                return Optional.empty();
            }
            return Optional.of(scores[id]);
        } catch (InputMismatchException e) {
            sc.next();
            return Optional.empty();
        }
    }
}
