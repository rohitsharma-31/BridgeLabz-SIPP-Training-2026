import java.util.Scanner;

public class PowerForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Power Using For Loop ===");
        System.out.print("Enter Number: ");
        int base = sc.nextInt();

        System.out.print("Enter Power: ");
        int power = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println("Result = " + result);
        sc.close();
    }
}