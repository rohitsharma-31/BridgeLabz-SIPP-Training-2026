import java.util.Scanner;

public class PalindromeNumber {
    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + Math.abs(number % 10);
            number /= 10;
        }
        return result;
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) return false;
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(number + (isPalindrome(number) ? " is a palindrome." : " is not a palindrome."));
        sc.close();
    }
}
