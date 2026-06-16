import java.util.Scanner;

public class VowelConsonantTable {
    public static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char) (c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            }
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classifyCharacters(String text) {
        int length = getLength(text);
        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = charType(c);
        }
        return result;
    }

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

    public static void displayTable(String[][] table) {
        System.out.printf("%-5s %s%n", "Char", "Type");
        for (String[] row : table) {
            System.out.printf("%-5s %s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[][] table = classifyCharacters(text);
        displayTable(table);
        sc.close();
    }
}
