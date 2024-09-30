package ec.ControlFlow;

public class While {
    public static void main(String[] args) {
        // We use while when we don't know the exact range of iterations
        // The while loop continues to execute as long as the condition is true
        // Pre-test: checks the condition before executing the loop
        int i = 0;
        while (i < 5) {
            System.out.printf("i = %d\n", i);
            i++;
        }

        boolean hasTest = true;
        // This while loop runs until the hasTest variable is set to false
        while (hasTest) {
            if (i == 7) {
                hasTest = false; // Stops the loop when i equals 7
            }
            i++;
            System.out.printf("i = %d\n", i);
        }

        // Post-test: checks the condition after executing the loop
        // The do-while loop executes at least once even if the condition is false
        boolean isTest = false;
        do {
            System.out.printf("Execute one time, value is %b\n", isTest);
        } while (isTest);

        boolean isExecute = true;
        int j = 0;
        do {
            if (i == 10) {
                isExecute = false;
            }
            System.out.printf("i = %d\n", i);
            i++;
        } while (isExecute);
    }
}
