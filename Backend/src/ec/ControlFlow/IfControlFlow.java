package ec.ControlFlow;

import java.util.Scanner;

public class IfControlFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your average?");
        float avgStudent = sc.nextFloat();


        if (avgStudent < 0 || avgStudent > 10) {
            System.out.println("Please insert a valid grade within the scale of 0 to 10.");
            return;
        }


        if (avgStudent >= 6.5) {
            System.out.println("Congratulations! Excellent average.");
        } else if (avgStudent >= 6.0) {
            System.out.println("You need to try harder.");
        } else if (avgStudent >= 5.5) {
            System.out.println("Good, but there's room for improvement.");
        } else if (avgStudent >= 5.0) {
            System.out.println("You are close to passing. Keep working on it.");
        } else if (avgStudent >= 4.0) {
            System.out.println("You need significant improvement.");
        } else {
            System.out.println("Unfortunately, you have failed. You need to put in more effort.");
        }

        System.out.println("Your average is: " + avgStudent);
    }
}
