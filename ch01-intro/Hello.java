import java.util.Scanner; // Lets us use Scanner for reading keyboard input

/*
 * Hello.java
 *
 * This beginner program:
 * 1) asks the user for their name
 * 2) reads the name from the keyboard
 * 3) prints a greeting
 *
 * This is a typical driver type of program that holds a static main() method,
 *   so it can be run like an application.
 */
public class Hello { // Class block to define the Hello class

    // main() is where the program starts running
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard (System.in)
        Scanner input = new Scanner(System.in);

        // Print a prompt so the user knows what to type
        System.out.print("Enter your name: ");

        // Read a whole line of text that the user types (their name)
        String name = input.nextLine();

        // Use the name variable to build a greeting message and print it
        System.out.println("Hello " + name + "!");

        // Close the Scanner (good habit: releases the resource)
        input.close();
    }
}
