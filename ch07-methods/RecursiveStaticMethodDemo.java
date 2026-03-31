/**
 * Demonstrates recursive static methods.
 *
 * <p>This class includes two examples:
 * one that returns a value ({@link #factorial(int)})
 * and one that prints a countdown ({@link #countDown(int)}).
 */
public class RecursiveStaticMethodDemo {

    /**
     * Calculates {@code n!} (factorial of n) using recursion.
     *
     * <p>Base case: if {@code n <= 1}, return {@code 1}.
     * Recursive case: return {@code n * factorial(n - 1)}.
     *
     * @param n non-negative integer input
     * @return factorial of {@code n}
     * @throws IllegalArgumentException if {@code n < 0}
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    /**
     * Prints a countdown recursively from {@code start} to {@code 0}.
     *
     * <p>Base case: if {@code start <= 0}, print {@code 0} and stop.
     * Recursive case: print current value and call with {@code start - 1}.
     *
     * @param start the number to begin counting down from
     */
    public static void countDown(int start) {
        if (start <= 0) {
            System.out.println(0);
            return;
        }

        System.out.println(start);
        countDown(start - 1);
    }

    /**
     * Runs the recursion examples.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int value = 5;
        System.out.println("factorial(" + value + ") = " + factorial(value));

        System.out.println("Countdown from 4:");
        countDown(4);
    }
}