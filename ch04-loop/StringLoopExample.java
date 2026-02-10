import java.util.Scanner;

public class StringLoopExample {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scnr.next();

        int vowelCount = 0;

        // Iterate from index 0 up to (but not including) length
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            // change c to lowercase to simplify vowel checking
            c = Character.toLowerCase(c);

            // Check if the current character is a lowercase vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}