package ec.Arrays;

public class ExampleBubbleSort {
    public static void main(String[] args) {
        // Array of car brands to be sorted
        String[] cards = {"chevrolet", "kia", "toyota", "nissan", "mazda", "ferry", "fiat"};
        int cardsLength = cards.length;

        // Bubble Sort algorithm with optimization
        for (int i = 0; i < cardsLength - 1; i++) {
            boolean swapped = false; // Tracks if any swapping happens in the current pass

            for (int j = 0; j < cardsLength - 1 - i; j++) {
                // Compare adjacent elements and swap if out of order
                if (cards[j + 1].compareTo(cards[j]) < 0) {
                    String aux = cards[j];
                    cards[j] = cards[j + 1];
                    cards[j + 1] = aux;
                    swapped = true; // Set flag to true if a swap occurs
                }
            }

            // If no elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        // Print the sorted array
        System.out.println("Sorted car brands:");
        for (String card : cards) {
            System.out.println(card);
        }
    }
}
