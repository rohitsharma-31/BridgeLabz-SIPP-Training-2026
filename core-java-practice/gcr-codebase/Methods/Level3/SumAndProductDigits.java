import java.util.Scanner;

public class SumAndProductDigits {
    public static int sumDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int productDigits(int number) {
        int product = 1;
        number = Math.abs(number);
        if (number == 0) return 0;
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Sum of digits: " + sumDigits(number));
        System.out.println("Product of digits: " + productDigits(number));
        sc.close();
    }
}
