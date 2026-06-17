import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayOperationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter array size (or -1 to use a null array): ");
            int size = scanner.nextInt();
            Integer[] array;
            if (size == -1) {
                array = null;
            } else {
                array = new Integer[size];
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element for index " + i + ": ");
                    array[i] = scanner.nextInt();
                }
            }
            System.out.print("Enter index to retrieve: ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integer values.");
        } finally {
            scanner.close();
        }
    }
}
