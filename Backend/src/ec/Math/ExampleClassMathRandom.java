package ec.Math;

public class ExampleClassMathRandom {
    public static void main(String[] args) {
        // Math.random() generates a random number between 0 (inclusive) and 1 (exclusive)
        double random = Math.random();
        System.out.printf("Random number (0-1): %f%n", random);

        // Multiply the random number by 7 to scale it between 0 and 7 (exclusive)
        random *= 7;
        System.out.printf("Random number scaled (0-7): %f%n", random);

        // Using Math.floor() to round down the value to the nearest integer
        random = Math.floor(random);
        System.out.printf("Random number rounded down: %f%n", random);

        // Creating an array of colors and selecting a random color
        String[] colors = {"red", "green", "blue", "yellow", "orange", "black"};
        int lengthColors = colors.length;

        // Display all colors in the array
        for (int i = 0; i < lengthColors; i++) {
            System.out.printf("Color at index %d: %s%n", i, colors[i]);
        }

        // Generate a random index within the bounds of the array length
        double randomColorNumber = Math.random() * lengthColors;
        randomColorNumber = Math.floor(randomColorNumber); // Round down to ensure valid index
        System.out.printf("Random color index: %f%n", randomColorNumber);

        // Cast to int to use as an index and display the randomly selected color
        System.out.printf("Random color is: %s%n", colors[(int) randomColorNumber]);
    }
}
