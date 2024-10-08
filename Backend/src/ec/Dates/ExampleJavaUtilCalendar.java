package ec.Dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExampleJavaUtilCalendar {
    public static void main(String[] args) {
        // Get an instance of the Calendar
        Calendar calendar = Calendar.getInstance();
        //calendar.set(2024, Calendar.FEBRUARY,2 , 19, 20 );
        // Set the calendar date and time

        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.JULY);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        //calendar.set(Calendar.HOUR_OF_DAY, 21); // Set the hour in 24-hour format
        calendar.set(Calendar.HOUR,7); //et the hour in 12-hour format
        calendar.set(Calendar.AM_PM, Calendar.PM); // Set AM/PM
        calendar.set(Calendar.MINUTE, 20); // Set the minutes
        calendar.set(Calendar.SECOND,10); // Set the seconds
        calendar.set(Calendar.MILLISECOND,125); //Set the milliseconds

        // Get the Date object from the calendar
        Date date = calendar.getTime();

        // Print the calendar date
        System.out.println("Calendar date is: " + date);

        // Define a date format
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");

        // Format and print the date
        String formattedDate = formatDate.format(date);
        System.out.println("Formatted date is: " + formattedDate);

    }
}
