import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter dividend: ");
            int dividend = scanner.nextInt();
            System.out.print("Enter divisor: ");
            int divisor = scanner.nextInt();
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integers.");
        } finally {
            System.out.println("Operation completed");
            scanner.close();
        }
    }
}
