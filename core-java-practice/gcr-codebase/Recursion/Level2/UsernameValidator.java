public class UsernameValidator {
    public static boolean isValidUsername(String username) {
        if (username == null) {
            return false;
        }
        return isValidUsername(username, 0);
    }

    private static boolean isValidUsername(String username, int index) {
        if (index == username.length()) {
            return true;
        }
        char ch = username.charAt(index);
        if (ch < 'a' || ch > 'z') {
            return false;
        }
        return isValidUsername(username, index + 1);
    }

    public static void main(String[] args) {
        String valid = "abcdxyz";
        String invalid = "abcD123";

        System.out.println(valid + " -> " + isValidUsername(valid));
        System.out.println(invalid + " -> " + isValidUsername(invalid));
    }
}
