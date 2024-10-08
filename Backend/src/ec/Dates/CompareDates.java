package ec.Dates;

import java.util.Calendar;
import java.util.Date;

public class CompareDates {
    public static void main(String[] args) {
        // Create a current date instance
        Date dateOne = new Date();

        // Set up the calendar for a specific date
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY); // Use the correct month (0 = January, 1 = February, ...)
        calendar.set(Calendar.DAY_OF_MONTH, 4);
        Date dateTwo = calendar.getTime();

        // Print both dates
        System.out.println("dateOne = " + dateOne);
        System.out.println("dateTwo = " + dateTwo);
        // Compare the dates
        if (dateOne.equals(dateTwo)){
            System.out.println("The dates are equal.");
        }
        if (dateOne.before(dateTwo)){
            System.out.println("Date one is before date two.");
        }
        if (dateOne.after(dateTwo)){
            System.out.println("Date one is after date two.");
        }

        // Comparison using compareTo
        int comparisonResult = dateOne.compareTo(dateTwo);
        if (comparisonResult == 0) {
            System.out.println("The dates are equal (using compareTo).");
        } else if (comparisonResult < 0) {
            System.out.println("Date one is before date two (using compareTo).");
        } else {
            System.out.println("Date one is after date two (using compareTo).");
        }
    }
}
