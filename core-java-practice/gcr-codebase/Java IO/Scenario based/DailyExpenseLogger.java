import java.io.*;

public class DailyExpenseLogger {
    private static final String EXPENSE_FILE = "expenses.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter expenses in format 'Category - amount'. Empty line to finish.");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(EXPENSE_FILE, true))) {
            while (true) {
                String line = br.readLine();
                if (line == null || line.trim().isEmpty()) break;
                bw.write(line.trim());
                bw.newLine();
                System.out.println("Appended: " + line.trim());
            }
        }
        System.out.println("Done. Expenses saved to " + EXPENSE_FILE);
    }
}
