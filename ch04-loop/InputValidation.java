import java.util.Scanner;

public class InputValidation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Demonstration of input validation logic in several forms.

        // While loop example for input validation
        // Duplicate code for user prompts and input reading.
        System.out.print("Enter a number between 0 and 10: ");
        int userInput = input.nextInt();
        while (userInput < 0 || userInput > 10) {
            System.out.println("Invalid input!");
            System.out.print("Please enter a number between 0 and 10: ");
            userInput = input.nextInt() ;
        }

        // Do-while loop example for input validation
        //
        // Duplicate code on condition check only.
        int userInput2;
        do {
            System.out.print("Enter a number between 0 and 10: ");
            userInput2 = input.nextInt();
            if (userInput2 < 0 || userInput2 > 10) {
                System.out.println("Invalid input!");
            }
        } while (userInput2 < 0 || userInput2 > 10);

        // While true loop with break for input validation
        // No duplicate code.
        while (true) {
            System.out.print("Enter a number between 0 and 10: ");
            int userInput3 = input.nextInt();
            if (userInput3 >= 0 && userInput3 <= 10) {
                break;
            }
            System.out.println("Invalid input!");
        }

        input.close();
        return;
    }

}
