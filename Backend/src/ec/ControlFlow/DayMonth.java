package ec.ControlFlow;

import java.util.Scanner;

public class DayMonth {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the month like a number between 1 - 12 ");
        int numberMonth = sc.nextInt();
        System.out.println("Insert the years in number like (YYYY)");
        int year = sc.nextInt();
        int numberOfDaysInMonth=0;



        switch (numberMonth){
            case 1, 3, 5, 7, 8, 10, 12 -> numberOfDaysInMonth = 31;
            case 4,6,9,11 -> numberOfDaysInMonth = 30;
            case 2 -> numberOfDaysInMonth = isLeapYear(year)?29 :28 ;
            default -> numberOfDaysInMonth = -1;
        }
        System.out.println("Number of days:".concat(String.valueOf(numberOfDaysInMonth)));

        System.out.println("Number of days:".concat(Integer.toString(numberOfDaysInMonth)));
    }
}
