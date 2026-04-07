/**
 * This is a state sharing class that models a patient's profile, including
 * weight and height.
 *
 * All methods have access to the shared state of the object (the private
 * fields).
 *
 */
public class PatientProfile {
    private double weight; // Private fields lock away internal data.
    private double height;

    // Constructor to initialize state at the moment of creation.
    public PatientProfile(double weight, double height) {
        this.weight = weight; // 'this' resolves shadowing conflicts.
        this.height = height;
    }

    // This method "shares state" by accessing the private fields above.
    //
    // "this." can be omitted since there is no shadowing conflict, but it is
    // included here for clarity.
    public double getBMI() {
        return this.weight / (this.height * this.height);
        // return weight / (height * height);
    }

    public void setWeight(double weight) {
        if (weight > 0) { // Security logic prevents invalid data.
            this.weight = weight;
        }
    }
}