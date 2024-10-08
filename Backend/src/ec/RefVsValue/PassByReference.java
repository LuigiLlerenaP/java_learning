package ec.RefVsValue;

public class PassByReference {
    public static void main(String[] args) {
        int[] scores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Start the main method");

        // Print the initial scores
        int max = scores.length;
        for (int i = 0; i < max; i++) {
            System.out.println("Scores = " + scores[i]);
        }

        System.out.println("Before calling the test method");
        test(scores);

        // Print scores after modification
        System.out.println("After calling the test method");
        for (int i = 0; i < max; i++) {
            System.out.println("Scores = " + scores[i]);
        }
        System.out.println("End of main method with array values");
    }

    // Method that modifies the scores array by reference
    public static void test(int[] scores) {
        System.out.println("Start the test method");
        int max = scores.length;

        // Increment each score by 20
        for (int i = 0; i < max; i++) {
            scores[i] += 20;
        }
        System.out.println("End of test method");
    }
}
