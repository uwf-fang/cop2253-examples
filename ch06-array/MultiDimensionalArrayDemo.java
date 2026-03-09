public class MultiDimensionalArrayDemo {
   public static void main(String[] args) {
      int[][] sales = {
            {120, 145, 132, 160},
            {98, 105, 111, 125},
            {200, 190, 210, 220}
      };

      String[] stores = {"North", "Central", "South"};
      String[] quarters = {"Q1", "Q2", "Q3", "Q4"};

      // Print the 2D table with one row per store and one column per quarter.
      System.out.printf("%-10s", "Store");
      for (String quarter : quarters) {
         System.out.printf("%-8s", quarter);
      }
      System.out.printf("%-8s%n", "Total");
      System.out.println("----------------------------------------------");

      for (int row = 0; row < sales.length; ++row) {
         int rowTotal = 0;
         System.out.printf("%-10s", stores[row]);

         for (int col = 0; col < sales[row].length; ++col) {
            rowTotal += sales[row][col];
            System.out.printf("%-8d", sales[row][col]);
         }

         System.out.printf("%-8d%n", rowTotal);
      }
   }
}
