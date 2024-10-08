package ec.ControlFlow;

public class ExampleTagSearch {
    public static void main(String[] args) {
        // Phrase to search in
        String phrase = "How can a clam cram in a clean cream can?";
        int max = phrase.length(); // Length of the phrase
        int countPhrase = 0; // Counter for occurrences
        char letter = 'c'; // Character to search for

        loopPhrase:
        for (int i = 0; i < max; i++) {
            // Check if the character at the current index matches the letter
            if (phrase.charAt(i) != letter) {
                continue loopPhrase; // Skip to the next iteration if it doesn't match
            }
            countPhrase++; // Increment the counter if it matches
        }
        System.out.printf("The character '%c' appears %d times in the phrase: \"%s\"%n", letter, countPhrase, phrase);

        ///
        String phraseTwo ="Peter Piper picked a peck of pickled peppers. A peck of pickled peppers Peter Piper picked. If Peter Piper picked a peck of pickled peppers, where's the peck of pickled peppers that Peter Piper picked";
        String word = "Piper";
        int maxWord = word.length();
        int maxPhase = phraseTwo.length() - maxWord;
        int countWord =0;

        searchingPhrase:
        for (int i=0;i<=maxPhase; i++){
            int k =i;
            for (int j=0; j<maxWord;j++){
                if (phraseTwo.charAt(k++) != word.charAt(j)){
                    continue searchingPhrase;
                }
            }
            countWord++;
        }
        System.out.printf("The word '%s' appears %d times in the phrase: \"%s\"%n",word, countWord, phraseTwo);
    }
}
