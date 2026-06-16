import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program 15: Factorial Using For Loop ===");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            long factorial = 1;

            for (int j = 1; j <= n; j++) {
                factorial *= j;
            }

            System.out.println("Factorial = " + factorial);
        }
        sc.close();
    }
}