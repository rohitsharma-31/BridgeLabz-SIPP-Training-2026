import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String s) {
        // access beyond length to generate StringIndexOutOfBoundsException
        char c = s.charAt(s.length());
        System.out.println(c);
    }

    public static void handleException(String s) {
        try {
            char c = s.charAt(s.length());
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.println("Calling generateException() (may throw):");
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getClass().getSimpleName());
        }

        System.out.println("Now calling handleException():");
        handleException(text);
        sc.close();
    }
}
