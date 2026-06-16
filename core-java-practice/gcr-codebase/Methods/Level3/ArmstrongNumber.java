import java.util.Scanner;

public class ArmstrongNumber {
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static boolean isArmstrong(int number) {
        if (number < 0) return false;
        int original = number;
        int digits = String.valueOf(number).length();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += power(digit, digits);
            number /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(number + (isArmstrong(number) ? " is an Armstrong number." : " is not an Armstrong number."));
        sc.close();
    }
}
