package ec.LineCommand;

public class ExampleCalculate {
    public static void main(String[] args) {
        // Typical applications in Java for batch processing, lots of data, or logging actions
        // Check if the correct number of arguments is provided
        if (args.length != 3) {
            System.out.println("Usage: java ExampleCalculate <operator> <first number> <second number>");
            System.exit(-1);
        }

        String operator = args[0];
        int numberOne = 0;
        int numberTwo = 0;
        double result = 0;

        // Validate that both arguments after the operator are integers
        try {
            numberOne = Integer.parseInt(args[1]);
            numberTwo = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input: both arguments must be integers.");
            System.exit(-1);
        }

        // Perform the operation based on the operator provided
        switch (operator) {
            case "add"  -> result = numberOne + numberTwo; // Addition
            case "sub"  -> result = numberOne - numberTwo; // Subtraction
            case "mul"  -> result = numberOne * numberTwo; // Multiplication
            case "div"  -> result = div(numberOne, numberTwo); // Division, using a separate method
            default -> {
                System.out.println("Invalid operator. Supported operators are: add, sub, mul, div.");
                System.exit(-1);
            }
        }

        // Display the result formatted to two decimal places
        System.out.printf("The result of the operation '%s' is: %.2f%n", operator, result);
    }

    // Separate method to handle division and prevent division by zero
    public static double div(double a, double b) {
        if (b == 0) {
            System.err.println("Error: Division by zero is not allowed.");
            System.exit(-1);
        }
        return a / b;
    }
}
