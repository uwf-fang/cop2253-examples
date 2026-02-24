public class CharacterCheck {
    public static void main(String[] args) {
        String stateAbbrev = "az";
        char let0 = stateAbbrev.charAt(0);
        char let1 = stateAbbrev.charAt(1);

        // Validate that both characters are letters
        if (Character.isLetter(let0) && Character.isLetter(let1)) {
            // Convert to uppercase
            let0 = Character.toUpperCase(let0);
            let1 = Character.toUpperCase(let1);
            System.out.println("State: " + let0 + let1); // Outputs "AZ"
        }

        // Other useful Character methods:
        System.out.println(Character.isDigit('5'));      // true
        System.out.println(Character.isWhitespace(' ')); // true
    }
}