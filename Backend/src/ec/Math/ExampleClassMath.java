package ec.Math;

public class ExampleClassMath {
    public static void main(String[] args) {
        // We cannot create an instance of this class because its constructor is private, and the class is final,
        // which means it cannot be inherited.

        // Using Math.abs() to get the absolute value of positive and negative numbers
        int positiveAbsolute = Math.abs(10);
        System.out.printf("The absolute value of 10 is: %d%n", positiveAbsolute);

        int negativeAbsolute = Math.abs(-10);
        System.out.printf("The absolute value of -10 is: %d%n", negativeAbsolute);

        // Using Math.max() and Math.min() to find the maximum and minimum of two numbers
        double max = Math.max(3.5, 4);
        System.out.printf("The maximum value between 3.5 and 4 is: %.2f%n", max);

        double min = Math.min(3.4, 0.2);
        System.out.printf("The minimum value between 3.4 and 0.2 is: %.2f%n", min);

        // Using Math.ceil() to round up to the nearest integer
        double roundTop = Math.ceil(min);
        System.out.printf("The ceiling of the minimum value (rounded up) is: %.2f%n", roundTop);

        double roundBottom = Math.ceil(max);
        System.out.printf("The ceiling of the maximum value (rounded up) is: %.2f%n", roundBottom);

        // Using Math.random() to generate a random number and Math.round() to round it
        long numLong = Math.round(Math.random() * 10.5);
        System.out.printf("A random number between 0 and 10 is: %d%n", numLong);

        // Using Math.exp() to calculate the exponential (e^x)
        double exp = Math.exp(4);
        System.out.printf("The exponential value of e^4 is: %.2f%n", exp);

        // Using Math.log() to calculate the natural logarithm (log base e)
        double log = Math.log(2);
        System.out.printf("The natural logarithm (log base e) of 2 is: %.4f%n", log);

        // Using Math.pow() to calculate powers (base^exponent)
        double pow = Math.pow(2, 3);
        System.out.printf("2 raised to the power of 3 is: %.2f%n", pow);

        // Using Math.sqrt() to calculate the square root
        double sqrt = Math.sqrt(2);
        System.out.printf("The square root of 2 is: %.4f%n", sqrt);

        // Trigonometry functions:
        // Using Math.toDegrees() to convert radians to degrees
        double degrees = Math.toDegrees(1.55);
        degrees = Math.round(degrees); // Rounding the degree value
        System.out.printf("1.55 radians is approximately: %.2f degrees%n", degrees);

        // Using Math.toRadians() to convert degrees to radians
        double radians = Math.toRadians(90);
        System.out.printf("90 degrees is: %.4f radians%n", radians);

        // Using Math.sin() and Math.cos() for trigonometric calculations
        System.out.printf("The sine of 90 degrees is: %.4f%n", Math.sin(radians));
        System.out.printf("The cosine of 90 degrees is: %.4f%n", Math.cos(radians));
    }
}
