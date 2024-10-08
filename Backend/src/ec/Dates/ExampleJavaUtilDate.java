package ec.Dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleJavaUtilDate {
    public static void main(String[] args) {
        // Create an instance of the Date class
        Date date = new Date();
        System.out.printf("The date is: %s%n", date);

        // Define a custom date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd G 'at' HH:mm:ss z E");
        String formattedDate = dateFormat.format(date);
        System.out.printf("The formatted date is: %s%n", formattedDate);

        // SimpleDateFormat supports many patterns like "dd", "MM", "yyyy", etc.
    }
}
