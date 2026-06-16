import java.util.Scanner;

public class MultiplesForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Multiples Below 100 Using For Loop ===");
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            for (int i = number; i < 100; i += number) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}