/**
  * Examples to demonstrate inter-conversion of various loop statements.
 */
public class InterConversion {
    public static void main(String[] args) {
        // for loop to while loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop: " + i);
        }

        int j = 0;
        while (j < 5) {
            System.out.println("While Loop: " + j);
            j++;
        }

        // while loop to do-while loop
        int k = 0;
        while (k < 5) {
            System.out.println("While Loop: " + k);
            k++;
        }

        int m = 0;
        do {
            System.out.println("Do-While Loop: " + m);
            m++;
        } while (m < 5);

        // While true loops
        while (true) {
            System.out.println("This is an infinite loop using while.");
            break; // To prevent actual infinite loop
        }

        for (;;) {
            System.out.println("This is an infinite loop using for.");
            break; // To prevent actual infinite loop
        }
    }
}
