import java.util.Scanner;

public class IfElseExamples {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // --- Example 1: Basic If-Else (Equality) ---
        System.out.print("Enter your age: ");
        int userAge = scnr.nextInt();

        // Simple check: If true, do one thing; else, do another.
        // Good practice: Always use braces {} even for single statements [3], [4].
        if (userAge >= 18) {
            System.out.println("You are an adult.");
        }
        else {
            System.out.println("You are a minor.");
        }

        // --- Example 2: Multi-Branch If-ElseIf-Else (Ranges) ---
        // This detects specific ranges. Implicitly, if the first condition (score >= 90)
        // is false, the next check implies the score is < 90 [2].
        System.out.print("Enter test score (0-100): ");
        int score = scnr.nextInt();

        if (score >= 90) {
            System.out.println("Grade: A");
        }
        else if (score >= 80) {
            System.out.println("Grade: B");
        }
        else if (score >= 70) {
            System.out.println("Grade: C");
        }
        else {
            // The "catch-all" if none of the above are true [5].
            System.out.println("Grade: F");
        }

        // --- Example 3: Boolean Logic & Short Circuiting ---
        // Using && (AND) to check two conditions.
        // Short circuit: If score is 50, (score > 100) is false,
        // so (score < 0) is never evaluated [6].
        if ((score > 100) || (score < 0)) {
            System.out.println("Warning: Invalid score detected.");
        }
    }
}
