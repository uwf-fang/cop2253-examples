/**
 * A library class for a Restaurant entity. This class includes private fields
 * for the restaurant's name and rating,
 *
 * - All methods have access to the shared state of the object (the private
 *   fields).
 * - The class provides public getter and setter methods to access and modify
 *   the private fields, ensuring encapsulation and data integrity.
 */
public class Restaurant {
    private String name;
    private int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() { return name; } // Standard getter prefix.

    public void setName(String name) { this.name = name; } // Standard setter.

    public void setRating(int rating) {
        // Enforces valid data: rating should not be $0$ or $-99$.
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        }
    }

    public int getRating() { return rating; } // Standard getter.
}