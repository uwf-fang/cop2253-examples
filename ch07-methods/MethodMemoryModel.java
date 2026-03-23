import java.util.Arrays;

public class MethodMemoryModel {

    // A void method that takes a primitive parameter.
    // Java passes a copy of the value, so the original remains unchanged.
    public static void tryToChangePrimitive(int x) {
        x = 99;
    }

    // A method that modifies array contents.
    // It receives a copy of the reference, so it can change the actual data.
    public static void modifyArrayContent(int[] arr) {
        if (arr.length > 0) {
            arr[0] = 99; // This mutates the content on the heap.
        }
    }

    // A method that tries to reassign the array reference.
    // This hits "The Limit": it cannot change the caller's original reference.
    public static void tryToReassignArray(int[] arr) {
        arr = new int[]{1, 2, 3};
    }

    // A method that returns a value.
    public static int calculateSquare(int num) {
        return num * num; // Returns exactly one value.
    }

    public static void main(String[] args) {
        // Primitive Pass-by-Value
        int myNumber = 5;
        tryToChangePrimitive(myNumber);
        System.out.println("Primitive after method call: " + myNumber); // Still 5

        // Array Pass-by-Value (Mutating Content)
        int[] myArray = {10, 20, 30};
        modifyArrayContent(myArray);
        System.out.println("Array after content modification: " + Arrays.toString(myArray)); //

        // Array Pass-by-Value (Reassigning Reference)
        tryToReassignArray(myArray);
        System.out.println("Array after attempted reassignment: " + Arrays.toString(myArray)); // Still

        // Using a return value in an expression (Composition)
        int total = 10 + calculateSquare(4);
        System.out.println("Total using composition: " + total); // 26
    }
}