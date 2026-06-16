import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Reversed number: " + reverse(number));
        sc.close();
    }
}
