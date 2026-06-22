import java.io.*;
import java.util.*;

public class SchoolResultPortal {
    private static final String INPUT = "school_results.txt";
    private static final String REPORT = "report_card.txt";

    public static void main(String[] args) {
        try {
            if (args.length > 0 && "add".equalsIgnoreCase(args[0])) {
                addResult();
            } else {
                generateReport();
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Input file not found: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println("I/O error: " + ioe.getMessage());
        }
    }

    // Append a new student result to the input data file
    private static void addResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter student name: ");
        String name = br.readLine();
        System.out.print("Enter marks (comma separated, e.g. 80,90,75): ");
        String marksLine = br.readLine();

        try (FileWriter fw = new FileWriter(INPUT, true)) {
            fw.write(name + "," + marksLine + System.lineSeparator());
            System.out.println("Result appended to " + INPUT);
        }
    }

    // Read input file, compute averages and append formatted report cards
    private static void generateReport() throws IOException {
        File inFile = new File(INPUT);
        if (!inFile.exists()) {
            throw new FileNotFoundException(INPUT);
        }

        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) lines.add(line.trim());
            }
        }

        if (lines.isEmpty()) {
            System.out.println("No data found in " + INPUT);
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(REPORT, true))) { // append
            for (String l : lines) {
                // expected format: Name,mark1,mark2,...
                String[] parts = l.split("\\s*,\\s*");
                String name = parts[0];
                int sum = 0;
                int count = 0;
                StringBuilder marks = new StringBuilder();
                for (int i = 1; i < parts.length; i++) {
                    try {
                        int m = Integer.parseInt(parts[i]);
                        sum += m; count++;
                        if (marks.length() > 0) marks.append(", ");
                        marks.append(m);
                    } catch (NumberFormatException nfe) {
                        // skip invalid mark
                    }
                }
                double avg = count > 0 ? (double) sum / count : 0.0;

                bw.write("Name: " + name + System.lineSeparator());
                bw.write("Marks: " + marks.toString() + System.lineSeparator());
                bw.write(String.format("Average: %.2f", avg) + System.lineSeparator());
                bw.write("------------------------------" + System.lineSeparator());
            }
            System.out.println("Report appended to " + REPORT);
        }
    }
}
