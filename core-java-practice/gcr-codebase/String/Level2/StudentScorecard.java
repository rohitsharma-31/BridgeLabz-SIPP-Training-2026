import java.util.Scanner;

public class StudentScorecard {
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = 40 + (int) (Math.random() * 61);
            scores[i][1] = 40 + (int) (Math.random() * 61);
            scores[i][2] = 40 + (int) (Math.random() * 61);
        }
        return scores;
    }

    public static String[][] calculateTotals(int[][] scores) {
        String[][] result = new String[scores.length][5];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = total * 100.0 / 300.0;
            result[i][0] = String.valueOf(total);
            result[i][1] = String.valueOf(Math.round(average * 100.0) / 100.0);
            result[i][2] = String.valueOf(Math.round(percentage * 100.0) / 100.0);
        }
        return result;
    }

    public static String[][] calculateGrades(String[][] totals) {
        String[][] result = new String[totals.length][1];
        for (int i = 0; i < totals.length; i++) {
            double percentage = Double.parseDouble(totals[i][2]);
            String grade;
            if (percentage >= 90) grade = "A";
            else if (percentage >= 80) grade = "B";
            else if (percentage >= 70) grade = "C";
            else if (percentage >= 60) grade = "D";
            else grade = "F";
            result[i][0] = grade;
        }
        return result;
    }

    public static void displayScorecard(int[][] scores, String[][] totals, String[][] grades) {
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-10s %-6s%n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf(
                "%-8s %-8d %-8d %-8d %-8s %-10s %-6s%n",
                "S" + (i + 1),
                scores[i][0],
                scores[i][1],
                scores[i][2],
                totals[i][0],
                totals[i][1],
                grades[i][0]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        String[][] totals = calculateTotals(scores);
        String[][] grades = calculateGrades(totals);
        displayScorecard(scores, totals, grades);
        sc.close();
    }
}
