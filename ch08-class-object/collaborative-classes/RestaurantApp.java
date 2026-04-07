/**
 * A driver class for the Restaurant library. This class demonstrates how to
 * create and manipulate Restaurant objects.
 *
 * A pure driver class typically contains a main method that serves as the
 * entry point for the application. It may also include static helper methods
 * to support the main method, but it does not maintain any state or instance
 * variables of its own.
 *
 * It is recommended to beginners to make a simple driver class that only
 * contains the main method, and then add static helper methods as needed.
 *
 * Leave the other logics in the library classes.
 */
public class RestaurantApp {

    // A static supporting method within the driver
    public static void printStatus(String message) {
        System.out.println("[SYSTEM]: " + message);
    }

    public static void main(String[] args) {
        printStatus("Initializing Restaurant System...");

        // 1. DECLARATION & 2. ALLOCATION
        Restaurant favPlace = new Restaurant("Joe's", 5);

        // Invocation: The dot operator acts as the bridge.
        favPlace.setRating(4);

        System.out.println(favPlace.getName() + " is rated " + favPlace.getRating());

        printStatus("Done."); //
    }
}