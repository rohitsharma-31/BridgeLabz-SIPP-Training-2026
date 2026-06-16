public class ReverseStringRecursive {
    public static String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String input = "BridgeLabz";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverse(input));
    }
}
