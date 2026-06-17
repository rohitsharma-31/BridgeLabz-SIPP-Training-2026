import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter array size: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter value for index " + i + ": ");
                array[i] = scanner.nextInt();
            }
            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();
            System.out.print("Enter divisor: ");
            int divisor = scanner.nextInt();
            try {
                int value = array[index];
                int result = value / divisor;
                System.out.println("Result: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}
