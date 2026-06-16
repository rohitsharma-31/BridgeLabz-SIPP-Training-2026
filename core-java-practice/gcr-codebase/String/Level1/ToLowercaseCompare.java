import java.util.Scanner;

public class ToLowercaseCompare {
    public static String toLowerUsingCharAt(String s) {
        if (s == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char) (c + 32);
            sb.append(c);
        }
        return sb.toString();
    }

    public static boolean compareUsingCharAt(String a, String b) {
        if (a == null || b == null) return a == b;
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full text (may contain spaces):");
        String text = sc.nextLine();

        String manual = toLowerUsingCharAt(text);
        String builtin = text.toLowerCase();

        System.out.println("Manual lowercase: " + manual);
        System.out.println("Built-in lowercase: " + builtin);
        System.out.println("Match: " + compareUsingCharAt(manual, builtin));
        sc.close();
    }
}
