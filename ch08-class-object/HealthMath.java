/**
 * A library class for health-related mathematical calculations. This is a
 * function holder class, meaning it contains static methods that can be
 * called without creating an instance of the class.
 *
 * The calculateBMI method computes the Body Mass Index (BMI) based on weight
 * and height parameters
 */
public class HealthMath {

    /**
     * Calculates BMI using direct parameters.
     * @param weight in kg
     * @param height in meters
     * @return the calculated BMI
     */
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        // Example usage of the calculateBMI method
        double weight = 70.0; // in kg
        double height = 1.75; // in meters

        // You can call the static method directly without mentioning the class
        // name since we are in the same class.
        double bmi = calculateBMI(weight, height);
        System.out.println("Calculated BMI: " + bmi);
    }
}