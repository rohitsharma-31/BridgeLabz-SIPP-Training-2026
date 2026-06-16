import java.util.Scanner;

public class StudentVotingAge {
    public static int[] generateAges(int count) {
        int[] ages = new int[count];
        for (int i = 0; i < count; i++) {
            ages[i] = 10 + (int) (Math.random() * 90);
        }
        return ages;
    }

    public static String[][] evaluateVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = String.valueOf(ages[i] >= 18);
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.printf("%-6s %s%n", "Age", "Can Vote");
        for (String[] row : table) {
            System.out.printf("%-6s %s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int count = sc.nextInt();

        int[] ages = generateAges(count);
        String[][] table = evaluateVoting(ages);
        displayTable(table);
        sc.close();
    }
}
