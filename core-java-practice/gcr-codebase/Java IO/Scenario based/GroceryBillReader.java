import java.io.*;

public class GroceryBillReader {
    private static final String BILL_FILE = "bill.txt";

    public static void main(String[] args) {
        File f = new File(BILL_FILE);
        if (!f.exists()) {
            System.out.println("Bill file not found: " + BILL_FILE);
            return;
        }

        int lines = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String ln;
            while ((ln = br.readLine()) != null) {
                System.out.println(ln);
                lines++;
            }
            System.out.println("Total lines: " + lines);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
