package ec.Operators;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        // Ternary operator syntax (The true and false values must have the same type):
        // type variable = (condition) ? value_if_true : value_if_false;

        String isGreater = (7 > 9) ? "Yes" : "No";
        System.out.println("Is 7 greater than 9? " + isGreater);

        double averageOne = 6.2;
        String status = (averageOne >= 5.49) ? "Approved" : "Rejected";
        System.out.println("You are " + status + "!");


        double math = 0.0;
        double science = 0.0;
        double history = 0.0;
        double average = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Your scores are on a scale of two to seven.");


        System.out.print("What is your score in Math? ");
        math = sc.nextDouble();

        System.out.print("What is your score in Science? ");
        science = sc.nextDouble();


        System.out.print("What is your score in History? ");
        history = sc.nextDouble();

        // Calculating the average score
        average = (math + science + history) / 3;

        // Checking if the average score is within the range of 2 to 7
        boolean statusScore = (average >= 2 && average <= 7);
        String hasApproved = statusScore ? "Approved" : "Rejected";

        System.out.println("You are " + hasApproved + "! With an average: " + String.format("%.2f",average));


        sc.close();

        
    }
}
