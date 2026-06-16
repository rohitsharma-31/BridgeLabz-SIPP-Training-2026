import java.util.Scanner;

public class SumNaturalNumbersRecursive {
    public static int recursiveSum(int n) {
        if (n <= 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Sum of first " + n + " natural numbers: " + recursiveSum(n));
        }
        sc.close();
    }
}
