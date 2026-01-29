import java.util.Scanner;

public class AdvancedBranches {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // --- Example 1: String Comparisons ---
        System.out.print("Type 'Exit' to quit: ");
        String input = scnr.next();

        // INCORRECT: input == "Exit" compares memory addresses, not text.
        // CORRECT: use .equals() [13].
        if (input.equals("Exit")) {
            System.out.println("Goodbye!");
        }
        else {
            System.out.println("Continuing...");
        }

        // --- Example 2: Conditional Expression (Ternary Operator) ---
        // A shorthand for simple if-else assignments.
        // Format: (condition) ? trueVal : falseVal [12].

        System.out.print("Enter a number: ");
        int num = scnr.nextInt();

        // Assigns "Even" if num % 2 is 0, otherwise "Odd".
        String status = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(num + " is " + status);
    }
}