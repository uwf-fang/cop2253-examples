public class ArrayInitialization {
   public static void main(String[] args) {
        // 1. Declaration followed by manual assignment
        int[] ages = new int[3]; // Allocates space for 3 integers [cite: 35]
        ages[0] = 19; // Assigning values using indices [cite: 42]
        ages[1] = 21;
        ages[2] = 25;

        // 2. Using an array initializer (Perfect Size Array)
        // This automatically sets the size based on the number of elements [cite: 108, 1618]
        int[] scores = {95, 88, 72, 100};

        // 3. Using a loop to initialize (common for larger lists) [cite: 110]
        int[] sequence = new int[5];
        for (int i = 0; i < sequence.length; ++i) {
            sequence[i] = i * 10; // Fills array with 0, 10, 20, 30, 40
        }
   }
}