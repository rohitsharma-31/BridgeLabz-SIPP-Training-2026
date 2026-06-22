import java.io.*;

public class FeedbackAnalyzer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 feedback messages (press Enter after each):");
        int goodCount = 0;
        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            if (line == null) break;
            if (line.toLowerCase().contains("good")) goodCount++;
        }
        System.out.println("Good Feedback Count = " + goodCount);
    }
}
