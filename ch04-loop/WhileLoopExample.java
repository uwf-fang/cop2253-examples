import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int inputVal;
        int sum = 0;

        System.out.println("Enter numbers to sum (enter -1 to finish):");

        // Priming read: Get the first value before the loop check
        inputVal = scnr.nextInt();

        // Loop continues as long as the input is not the sentinel (-1)
        while (inputVal != -1) {
            sum = sum + inputVal;

            // Update read: Get the next value at the end of the loop
            inputVal = scnr.nextInt();
        }

        System.out.println("Total Sum: " + sum);
    }
}