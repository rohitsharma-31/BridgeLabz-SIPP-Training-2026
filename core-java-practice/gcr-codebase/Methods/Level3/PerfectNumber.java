import java.util.Scanner;

public class PerfectNumber {
    public static boolean isPerfect(int number) {
        if (number <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(number + (isPerfect(number) ? " is a perfect number." : " is not a perfect number."));
        sc.close();
    }
}
