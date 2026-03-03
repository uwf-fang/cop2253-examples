public class FindMax1 {
    public static void main(String[] args) {
        int[] testGrades = {75, 92, 84, 99, 68};
        int maxGrade;
        int i;

        // for each loop
        // use the min integer value to ensure any grade will be higher
        maxGrade = Integer.MIN_VALUE;

        for (int grade : testGrades) {
            if (grade > maxGrade) {
                maxGrade = grade; // Update max if current is larger
            }
        }

        System.out.println("The highest grade is: " + maxGrade);
    }
}
