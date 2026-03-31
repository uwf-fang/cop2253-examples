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

    public static void main(String[] args) {
        double calories = pizzaCalories(12.0);
        System.out.printf("12-inch pizza calories: %.2f\n", calories);
    }
}