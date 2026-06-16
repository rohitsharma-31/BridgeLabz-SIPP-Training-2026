import java.util.Scanner;

public class SplitCompare {
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

    public static boolean compareArrays(String[] a, String[] b) {
        if (a == null || b == null) return a == b;
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] manual = splitManual(text);
        String[] builtin = text.split(" ");

        System.out.println("Manual words:");
        for (String word : manual) System.out.println(word);

        System.out.println("Built-in words:");
        for (String word : builtin) System.out.println(word);

        System.out.println("Match: " + compareArrays(manual, builtin));
        sc.close();
    }
}
