import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Multiples Below 100 Using While Loop ===");
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int multiple = number;

        while (multiple < 100) {
            System.out.print(multiple + " ");
            multiple += number;
        }
        System.out.println();
        sc.close();
    }
}