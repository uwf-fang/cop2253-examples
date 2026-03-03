public class ReverseArray {
   public static void main(String[] args) {
      int[] numbers = {10, 20, 30, 40, 50, 60};
      int i;
      int temp;

      // Loop only to the halfway point
      for (i = 0; i < (numbers.length / 2); ++i) {
         // Standard swap pattern using a temporary variable
         temp = numbers[i];
         numbers[i] = numbers[numbers.length - 1 - i];
         numbers[numbers.length - 1 - i] = temp;
      }

      System.out.print("Reversed array: ");
      for (int num : numbers) { // Using enhanced for loop to print
         System.out.print(num + " ");
      }
   }
}