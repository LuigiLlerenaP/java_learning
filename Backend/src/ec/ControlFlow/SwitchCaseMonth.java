package ec.ControlFlow;

import java.util.Scanner;

public class SwitchCaseMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the month like a number ");
        int numberMonth = sc.nextInt();
        String month = switch (numberMonth) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month number.Please insert a number between 1 and 12.";
        };

    }
}
