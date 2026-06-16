import java.util.Scanner;

public class SumNaturalNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program 12: Sum Using While Loop ===");
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            int formulaSum = n * (n + 1) / 2;
            int whileSum = 0;
            int i = 1;

            while (i <= n) {
                whileSum += i;
                i++;
            }

            System.out.println("Formula Sum = " + formulaSum);
            System.out.println("While Loop Sum = " + whileSum);
            System.out.println("Results Match = " + (formulaSum == whileSum));
        }
        sc.close();
    }
}