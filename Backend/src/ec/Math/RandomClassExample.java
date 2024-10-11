package ec.Math;

import java.util.Random;

public class RandomClassExample {
    public static void main(String[] args) {
        // It's optional to provide a seed to the Random constructor. Without a seed, it will generate different sequences each time.
        Random randomObject = new Random();

        // Generate a random integer between 0 (inclusive) and 10 (exclusive)
        int randomInt = randomObject.nextInt(10);
        System.out.printf("Random integer (0-9): %d%n", randomInt);

        // Generate a random long number
        long randomLong = randomObject.nextLong();
        System.out.printf("Random long: %d%n", randomLong);

        // Generate a random integer within a range, 1 (inclusive) and 4 (exclusive)
        int randomRange = randomObject.nextInt(1, 4);
        System.out.printf("Random integer in range (1-3): %d%n", randomRange);

        // Create an array of colors and randomly select one
        String[] colors = {"red", "green", "blue", "yellow", "orange", "black"};
        int lenColor = colors.length;

        // Display all colors
        for (String color : colors) {
            System.out.printf("Color: %s%n", color);
        }

        // Select a random color index and display the selected color
        randomInt = randomObject.nextInt(lenColor); // Random index from 0 to length of colors array (exclusive)
        System.out.printf("Random color: %s%n", colors[randomInt]);
    }
}
