public class FindMax {
    public static void main(String[] args) {
        int[] testGrades = { 75, 92, 84, 99, 68 };
        int maxGrade;
        int i;

        // Initialize maxVal with the first element
        maxGrade = testGrades[0];

        for (i = 0; i < testGrades.length; ++i) {
            if (testGrades[i] > maxGrade) {
                maxGrade = testGrades[i]; // Update max if current is larger
            }
        }

        System.out.println("The highest grade is: " + maxGrade);
    }
}