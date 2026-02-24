public class StringBasics {
    public static void main(String[] args) {
        String userText = "run";

        // This does NOT change userText
        userText.concat("ning");
        System.out.println("After concat without assignment: " + userText); // Outputs "run"

        // Reassignment is required to save the new string
        userText = userText.concat("ning");
        System.out.println("After reassignment: " + userText); // Outputs "running"

        // Accessing indices (Zero-based)
        // 'r' is at 0, 'u' is at 1, 'n' is at 2
        char firstLetter = userText.charAt(0);
        int totalLength = userText.length();
        char lastLetter = userText.charAt(userText.length() - 1); // Last index rule

        System.out.println("First letter: " + firstLetter);
        System.out.println("Length: " + totalLength);
        System.out.println("Last letter: " + lastLetter);
    }
}