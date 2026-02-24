public class EmailExtractor {
    public static void main(String[] args) {
        String email = "amari@xyz.com";

        // Find the position of the '@' symbol
        int atIndex = email.indexOf('@'); // returns 5

        if (atIndex != -1) {
            // Extract username: from index 0 up to (but not including) atIndex
            String username = email.substring(0, atIndex);

            // Extract domain: from the character after '@' to the end
            String domain = email.substring(atIndex + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        }

        // Advanced search: Find ".com" only after the '@' symbol
        int comIndex = email.indexOf(".com", atIndex);
        System.out.println(".com found at index: " + comIndex);
    }
}