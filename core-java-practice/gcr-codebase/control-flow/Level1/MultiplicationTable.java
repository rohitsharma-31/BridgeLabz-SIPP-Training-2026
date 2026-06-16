import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program 18: Multiplication Table ===");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int j = 6; j <= 9; j++) {
            System.out.println(n + " * " + j + " = " + (n * j));
        }
        sc.close();
    }
}