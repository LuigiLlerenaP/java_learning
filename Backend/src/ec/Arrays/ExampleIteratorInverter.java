package ec.Arrays;

public class ExampleIteratorInverter {
    public static void main(String[] args) {
        // Define the cards array
        String[] cards = {"chevrolet", "kia", "toyota", "nissan", "mazda", "ferry", "fiat"};
        int cardsLength = cards.length;
        int lastCardIndex = cardsLength - 1;

        // Invert the array using a standard 'for' loop
        System.out.println("Inverted cards using first method:");
        for (int i = 0; i < cardsLength; i++) {
            System.out.printf("Index: %d, Value: %s%n", lastCardIndex - i, cards[lastCardIndex - i]);
        }

        // Second example of array inversion with another array
        System.out.println("\nInverted colors using second method:");
        String[] colors = {"red", "green", "blue", "black", "white", "orange"};
        int colorsLength = colors.length;
        int lastColorIndex = colorsLength - 1;

        // Loop from the last element to the first
        for (int i = lastColorIndex; i >= 0; i--) {
            System.out.printf("Index: %d, Value: %s%n", i, colors[i]);
        }
    }
}
