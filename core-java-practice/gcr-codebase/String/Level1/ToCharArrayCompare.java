import java.util.Arrays;
import java.util.Scanner;

public class ToCharArrayCompare {
    public static char[] toCharArrayManual(String s) {
        if (s == null) return null;
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i);
        return arr;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a == null || b == null) return a == b;
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] manual = toCharArrayManual(text);
        char[] builtin = text.toCharArray();

        System.out.println("Manual chars: " + Arrays.toString(manual));
        System.out.println("Built-in chars: " + Arrays.toString(builtin));
        System.out.println("Match: " + compareCharArrays(manual, builtin));
        sc.close();
    }
}
