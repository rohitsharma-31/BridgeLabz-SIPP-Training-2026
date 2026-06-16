import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double value;

        System.out.println("=== Program 11: Sum Until 0 or Negative ===");
        while (true) {
            System.out.print("Enter number: ");
            value = sc.nextDouble();

            if (value <= 0) {
                break;
            }

            total += value;
        }

        System.out.println("Total Sum = " + total);
        sc.close();
    }
}