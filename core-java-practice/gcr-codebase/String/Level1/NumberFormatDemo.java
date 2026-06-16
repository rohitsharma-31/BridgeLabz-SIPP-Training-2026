import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateNumberFormat(String text) {
        int n = Integer.parseInt(text);
        System.out.println("Parsed number: " + n);
    }

    public static void handleNumberFormat(String text) {
        try {
            int n = Integer.parseInt(text);
            System.out.println("Parsed number: " + n);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to parse as integer: ");
        String text = sc.next();

        System.out.println("Calling generateNumberFormat() (may throw):");
        try {
            generateNumberFormat(text);
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getClass().getSimpleName());
        }

        System.out.println("Now calling handleNumberFormat():");
        handleNumberFormat(text);
        sc.close();
    }
}
