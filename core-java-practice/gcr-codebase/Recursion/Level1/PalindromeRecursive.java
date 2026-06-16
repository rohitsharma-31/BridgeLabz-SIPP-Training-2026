public class PalindromeRecursive {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        s = s.replaceAll("\\s+", "").toLowerCase();
        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    private static boolean isPalindromeHelper(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindromeHelper(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String input = "Race car";
        System.out.println("Is '" + input + "' a palindrome? " + isPalindrome(input));
    }
}
