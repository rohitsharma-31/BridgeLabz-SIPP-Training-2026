import java.util.Scanner;

public class SplitWordsWithLengths {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitManual(String text) {
        int length = getLength(text);
        if (length == 0) return new String[0];

        int spaces = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaces++;
        }

        int[] indexes = new int[spaces + 2];
        indexes[0] = -1;
        int idx = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                indexes[idx++] = i;
            }
        }
        indexes[idx] = length;

        String[] words = new String[spaces + 1];
        for (int j = 0; j < words.length; j++) {
            int start = indexes[j] + 1;
            int end = indexes[j + 1];
            StringBuilder sb = new StringBuilder();
            for (int k = start; k < end; k++) sb.append(text.charAt(k));
            words[j] = sb.toString();
        }
        return words;
    }

    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] words = splitManual(text);
        String[][] table = wordsWithLengths(words);

        System.out.printf("%-20s %s%n", "Word", "Length");
        for (String[] row : table) {
            int length = Integer.parseInt(row[1]);
            System.out.printf("%-20s %d%n", row[0], length);
        }
        sc.close();
    }
}
