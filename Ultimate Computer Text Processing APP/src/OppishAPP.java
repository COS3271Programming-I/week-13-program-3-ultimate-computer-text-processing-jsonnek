// Jonathan Sonnek
// 2/27/26
// Oppish APP

import java.util.Scanner;

public class OppishAPP {
    // Method to check if a character is a vowel
    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y');
    }
    public static void run(Scanner userinput) {
        // Get a sentence from the user
        userinput.nextLine(); // consume leftover newline from menu nextInt()
        System.out.println("Enter a sentence:");
        String sentence = userinput.nextLine();
        StringBuilder oppishSentence = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (i+1 < sentence.length() && !isVowel(c) && isVowel(sentence.charAt(i+1)) && Character.isLetter(c)) {
                oppishSentence.append(c).append("opp");
            }
            else {
                oppishSentence.append(c);
            }
        }

        System.out.println(oppishSentence.toString());
    }
}