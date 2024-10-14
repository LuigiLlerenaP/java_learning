package ec.Arrays;

public class ExampleIteratorArrays {
    public static void main(String[] args) {
        // Using 'for' loop to iterate over the 'cards' array
        System.out.println("Using for loop:");
        String[] cards = {"chevrolet", "kia", "toyota", "nissan", "mazda", "ferry", "fiat"};
        int cardsLength = cards.length;
        for (int i = 0; i < cardsLength; i++) {
            System.out.printf("Index %d, the value is: %s%n", i, cards[i]);
        }

        // Using 'foreach' loop to iterate over the 'colors' array
        System.out.println("\nUsing foreach loop:");
        String[] colors = {"red", "green", "blue", "black", "white", "orange"};
        for (String color : colors) {
            System.out.printf("The color is: %s%n", color);
        }

        // Using 'while' loop to iterate over the 'numbers' array
        System.out.println("\nUsing while loop:");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numbersLength = numbers.length;
        int index = 0;
        while (index < numbersLength) {
            System.out.printf("Index %d, the value is: %d%n", index, numbers[index]);
            index++;
        }

        // Using 'do-while' loop to iterate over the 'decimals' array
        System.out.println("\nUsing do-while loop:");
        double[] decimals = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9};
        int decimalsLength = decimals.length;
        int decimalIndex = 0;
        do {
            System.out.printf("Index %d, the value is: %.1f%n", decimalIndex, decimals[decimalIndex]);
            decimalIndex++;
        } while (decimalIndex < decimalsLength);

        // Using 'for' loop to add values to the 'nums' array
        System.out.println("\nAdding values to an array using for loop:");
        int[] nums = new int[10];
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
            nums[i] = i * 5;  // Populating the array with multiples of 5
        }

        // Using 'foreach' loop to print the values of the 'nums' array
        for (int num : nums) {
            System.out.printf("The number is: %d%n", num);
        }
    }
}
