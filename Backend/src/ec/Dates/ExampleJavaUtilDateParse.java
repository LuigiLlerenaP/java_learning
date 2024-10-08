package ec.Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Define the date format to be used for parsing
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Insert the date in the format 'yyyy-MM-dd':");

        try {
            // Read the date string input from the user
            Date date = format.parse(sc.next());
            System.out.println("Parsed date: " + date);
            // Format the date back to a string and print it
            System.out.println("Formatted date: " + format.format(date));
        } catch (ParseException e) {
            // Handle the parse exception with a user-friendly message
            System.err.println("Failed to parse date: " + e.getMessage());
        }
    }
}
