import java.util.Scanner;

public class StrongNumber {
    public static int factorial(int n) {
        if (n <= 1) return 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isStrong(int number) {
        if (number < 0) return false;
        int original = number;
        int sum = 0;
        while (number > 0) {
            sum += factorial(number % 10);
            number /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(number + (isStrong(number) ? " is a strong number." : " is not a strong number."));
        sc.close();
    }
}
