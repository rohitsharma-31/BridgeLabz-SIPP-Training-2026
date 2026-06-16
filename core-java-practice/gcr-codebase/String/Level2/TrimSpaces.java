import java.util.Scanner;

public class TrimSpaces {
    public static int[] findTrimPoints(String s) {
        int start = 0;
        int end = getLength(s) - 1;

        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }
        return new int[] {start, end + 1};
    }

    public static String substringUsingCharAt(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareUsingCharAt(String a, String b) {
        if (a == null || b == null) return a == b;
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text with leading/trailing spaces:");
        String text = sc.nextLine();

        int[] points = findTrimPoints(text);
        String manualTrimmed = substringUsingCharAt(text, points[0], points[1]);
        String builtinTrimmed = text.trim();

        System.out.println("Manual trimmed: '" + manualTrimmed + "'");
        System.out.println("Built-in trimmed: '" + builtinTrimmed + "'");
        System.out.println("Match: " + compareUsingCharAt(manualTrimmed, builtinTrimmed));
        sc.close();
    }
}
