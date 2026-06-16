import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Factors Using While Loop ===");
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int i = 1;
        System.out.print("Factors: ");
        while (i < number) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        sc.close();
    }
}