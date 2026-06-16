import java.util.Scanner;

public class CharacterFrequency {
    public static String[][] frequency(String text) {
        int[] freq = new int[256];
        int length = text.length();
        boolean[] seen = new boolean[256];

        for (int i = 0; i < length; i++) {
            freq[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (!seen[text.charAt(i)]) {
                seen[text.charAt(i)] = true;
                count++;
            }
        }

        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (!seen[c]) continue;
            seen[c] = false;
            result[index][0] = String.valueOf(c);
            result[index][1] = String.valueOf(freq[c]);
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[][] result = frequency(text);
        System.out.printf("%-5s %s%n", "Char", "Freq");
        for (String[] row : result) {
            System.out.printf("%-5s %s%n", row[0], row[1]);
        }
        sc.close();
    }
}
