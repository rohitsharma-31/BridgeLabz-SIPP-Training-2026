import java.util.Scanner;

public class CompareStrings {
    public static boolean compareUsingCharAt(String a, String b) {
        if (a == null || b == null) return a == b;
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();

        boolean charAtResult = compareUsingCharAt(s1, s2);
        boolean equalsResult = s1.equals(s2);

        System.out.println("compareUsingCharAt: " + charAtResult);
        System.out.println("String.equals: " + equalsResult);
        System.out.println("Results match: " + (charAtResult == equalsResult));
        sc.close();
    }
}
