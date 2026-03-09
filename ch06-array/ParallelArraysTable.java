public class ParallelArraysTable {
   public static void main(String[] args) {
      String[] studentNames = {"Ava", "Noah", "Mia", "Ethan"};
      int[] exam1 = {88, 94, 76, 85};
      int[] exam2 = {91, 89, 84, 92};

      System.out.printf("%-10s %-8s %-8s %-8s%n", "Student", "Exam1", "Exam2", "Avg");
      System.out.println("------------------------------------");

      for (int i = 0; i < studentNames.length; ++i) {
         double average = (exam1[i] + exam2[i]) / 2.0;
         System.out.printf("%-10s %-8d %-8d %-8.1f%n", studentNames[i], exam1[i], exam2[i], average);
      }
   }
}
