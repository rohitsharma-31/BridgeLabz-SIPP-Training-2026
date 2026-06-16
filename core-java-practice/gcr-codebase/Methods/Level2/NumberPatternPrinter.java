import java.util.Scanner;

public class NumberPatternPrinter {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        if (rows <= 0) {
            System.out.println("Please enter a positive number of rows.");
        } else {
            printPattern(rows);
        }
        sc.close();
    }
}
