/**
 * Demonstrates recursive static methods.
 *
 */
public class RecursiveStaticMethodDemo {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n <= 1) {
            return 1;
        }
        System.out.println("calling on " + n);
        return n * factorial(n - 1);
    }

    public static void countDown(int start) {
        if (start <= 0) {
            System.out.println(0);
            return;
        }

        System.out.println(start);
        countDown(start - 1);
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println("factorial(" + value + ") = " + factorial(value));

        System.out.println("Countdown from 4:");
        countDown(4);
    }
}