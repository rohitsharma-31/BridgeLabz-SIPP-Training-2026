import java.util.Scanner;

public class FactorsForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Factors Using For Loop ===");
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.print("Factors: ");
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}