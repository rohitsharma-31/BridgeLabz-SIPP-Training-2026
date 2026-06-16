import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program 13: Sum Using For Loop ===");
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            int formulaSum = n * (n + 1) / 2;
            int forSum = 0;

            for (int j = 1; j <= n; j++) {
                forSum += j;
            }

            System.out.println("Formula Sum = " + formulaSum);
            System.out.println("For Loop Sum = " + forSum);
            System.out.println("Results Match = " + (formulaSum == forSum));
        }
        sc.close();
    }
}