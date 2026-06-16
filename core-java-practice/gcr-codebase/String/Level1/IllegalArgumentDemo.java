import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateUsingSubstring(String s, int start, int end) {
        // this may throw StringIndexOutOfBoundsException (a RuntimeException)
        String sub = s.substring(start, end);
        System.out.println("Generated substring: " + sub);
    }

    public static void handleSubstringException(String s, int start, int end) {
        try {
            String sub = s.substring(start, end);
            System.out.println("Handled substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        System.out.println("Calling generateUsingSubstring() (may throw):");
        try {
            generateUsingSubstring(text, start, end);
        } catch (RuntimeException e) {
            System.out.println("Caught exception from generateUsingSubstring: " + e.getClass().getSimpleName());
        }

        System.out.println("Now calling handleSubstringException():");
        handleSubstringException(text, start, end);
        sc.close();
    }
}
