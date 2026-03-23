public class OverloadingAndScope {

    // A class field (class scope) accessible by all methods.
    static String name = "Global Name";

    // Method Overloading: First version of printDetails.
    public static void printDetails(int age) {
        System.out.println("Age only: " + age);
    }

    // Method Overloading: Second version with different parameter types.
    // Overloading cannot be based on return type alone.
    public static void printDetails(String personName, int age) {
        System.out.println("Name and Age: " + personName + " is " + age);
    }

    public static void demonstrateShadowing() {
        // Local variable with the same name as the class field.
        // The local variable "wins" and hides (shadows) the field.
        String name = "Local Name";
        System.out.println("Inside method, name is: " + name);
    }

    public static void main(String[] args) {
        printDetails(25);
        printDetails("Alice", 30);

        System.out.println("Before shadowing call, class field is: " + name);
        demonstrateShadowing();
    }
}