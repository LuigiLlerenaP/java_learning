package ec.LineCommand;

public class ArgsLineCommand {
    public static void main(String[] args) {
        // Check if any arguments are provided
        if (args.length == 0) {
            System.out.println("Invalid number of arguments. At least one argument is required.");
            System.exit(-1);  // Terminate the program if no arguments are passed
        }

        // Loop through the arguments and print each one
        for (int i = 0; i < args.length; i++) {
            System.out.printf("Argument %d: %s%n", i + 1, args[i]); // Print argument index and value
        }
    }
}
