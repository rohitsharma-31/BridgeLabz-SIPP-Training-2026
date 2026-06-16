import java.util.Scanner;

public class FibonacciSeries {
    public static void printFibonacci(int terms) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + (i < terms ? " " : ""));
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Fibonacci terms: ");
        int terms = sc.nextInt();
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
        } else {
            printFibonacci(terms);
        }
        sc.close();
    }
}
