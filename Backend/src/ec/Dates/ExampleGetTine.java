package ec.Dates;

import java.util.Date;

public class ExampleGetTine {
    public static void main(String[] args) {
        Date startDate = new Date();
        long sum = 0;

        // Perform sum operation
        for (int i = 0; i < 10_000_000; i++) {
            sum += i;
        }

        Date endDate = new Date();
        System.out.println("Sum = " + sum);

        // getTime returns the number of milliseconds since January 1, 1970, 00:00:00 GMT
        long timeElapsed = endDate.getTime() - startDate.getTime();

        // Display the elapsed time in milliseconds
        System.out.printf("Time elapsed: %d ms", timeElapsed);
    }
}
