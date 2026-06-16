import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double value;

        System.out.println("=== Program 10: Sum Until 0 ===");
        System.out.println("Enter numbers (0 to stop):");
        value = sc.nextDouble();

        while (value != 0) {
            total += value;
            value = sc.nextDouble();
        }

        System.out.println("Total Sum = " + total);
        sc.close();
    }
}