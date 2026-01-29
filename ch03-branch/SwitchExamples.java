import java.util.Scanner;

public class SwitchExamples {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1 - Burger");
        System.out.println("2 - Pizza");
        System.out.println("3 - Salad");
        System.out.print("Enter choice (1-3): ");

        int choice = scnr.nextInt();

        // A switch compares 'choice' to constant values (cases) [9].
        switch (choice) {
            case 1:
                System.out.println("You chose a Burger.");
                break; // 'break' stops execution here.

            case 2:
                System.out.println("You chose a Pizza.");
                break;

            case 3:
                System.out.println("You chose a Salad.");
                break;

            // 'default' executes if no case matches [10].
            default:
                System.out.println("Unknown item.");
                break;
        }

        // --- Example: Fall-Through Logic ---
        // Sometimes we omit 'break' intentionally so multiple cases
        // execute the same code [8].
        System.out.print("Enter a month number (1-12): ");
        int month = scnr.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                // If month is 12, 1, or 2, execution "falls through" to here.
                System.out.println("It's Winter.");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("It's Spring.");
                break;

            default:
                System.out.println("Summer or Autumn.");
                break;
        }
    }
}
