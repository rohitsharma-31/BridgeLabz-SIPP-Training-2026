import java.util.Scanner;

public class FrequencyUsingUniqueCharacters {
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] temp = new char[length];
        int count = 0;
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean exists = false;
            for (int j = 0; j < count; j++) {
                if (temp[j] == current) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                temp[count++] = current;
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) result[i] = temp[i];
        return result;
    }

    public static String[][] frequency(String text) {
        int[] freq = new int[256];
        int length = text.length();
        for (int i = 0; i < length; i++) {
            freq[text.charAt(i)]++;
        }
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
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
