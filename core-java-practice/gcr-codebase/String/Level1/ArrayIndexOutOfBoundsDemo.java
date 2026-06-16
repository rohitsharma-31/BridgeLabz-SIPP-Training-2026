import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] arr) {
        // access index equal to length to generate exception
        System.out.println(arr[arr.length]);
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter names separated by spaces: ");
        String line = sc.nextLine();
        if (line.trim().isEmpty()) {
            System.out.println("No names provided");
            sc.close();
            return;
        }
        String[] names = line.split("\\s+");

        System.out.println("Calling generateException() (may throw):");
        try {
            generateException(names);
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getClass().getSimpleName());
        }

        System.out.println("Now calling handleException():");
        handleException(names);
        sc.close();
    }
}
