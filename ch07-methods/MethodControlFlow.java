public class MethodControlFlow {

    // Method calling another method to perform a sub-task.
    public static double calcCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double pizzaCalories(double diameter) {
        double radius = diameter / 2.0;
        double area = calcCircleArea(radius); // Calls calcCircleArea
        return area * 2.5; // Assume 2.5 calories per square inch
    }

    // Recursion: A method that calls itself.
    public static void openNestingDoll(int dollSize) {
        // Base case: to stop the loop.
        if (dollSize <= 1) {
            System.out.println("Found the smallest solid doll!");
            return;
        }

        System.out.println("Opening doll of size " + dollSize + "...");
        // Recursive step: continues the process with a smaller doll.
        openNestingDoll(dollSize - 1);
    }

    public static void main(String[] args) {
        double calories = pizzaCalories(12.0);
        System.out.println("12-inch pizza calories: " + calories);

        System.out.println("\nStarting recursion:");
        openNestingDoll(4);
    }
}