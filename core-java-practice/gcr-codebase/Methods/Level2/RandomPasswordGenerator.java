import java.security.SecureRandom;
import java.util.Scanner;

public class RandomPasswordGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=";
    private static final SecureRandom random = new SecureRandom();

    public static String generatePassword(int length) {
        if (length <= 0) return "";
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            password.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return password.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        System.out.println("Generated password: " + generatePassword(length));
        sc.close();
    }
}
