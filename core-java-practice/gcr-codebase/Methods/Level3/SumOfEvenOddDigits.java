import java.util.Scanner;

public class SumOfEvenOddDigits {
    public static int sumEvenDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static int sumOddDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Sum of even digits: " + sumEvenDigits(number));
        System.out.println("Sum of odd digits: " + sumOddDigits(number));
        sc.close();
    }
}
