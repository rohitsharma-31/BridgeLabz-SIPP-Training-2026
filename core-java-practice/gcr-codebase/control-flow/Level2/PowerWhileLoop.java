import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Power Using While Loop ===");
        System.out.print("Enter Number: ");
        int base = sc.nextInt();

        System.out.print("Enter Power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        while (counter < power) {
            result *= base;
            counter++;
        }

        System.out.println("Result = " + result);
        sc.close();
    }
}