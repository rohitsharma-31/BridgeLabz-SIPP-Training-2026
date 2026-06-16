import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program 14: Factorial Using While Loop ===");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            long factorial = 1;
            int j = 1;

            while (j <= n) {
                factorial *= j;
                j++;
            }

            System.out.println("Factorial = " + factorial);
        }
        sc.close();
    }
}