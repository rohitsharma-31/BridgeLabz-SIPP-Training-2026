import java.util.Scanner;

public class EvenOddCount {
    public static int countEven(int number) {
        int count = 0;
        number = Math.abs(number);
        if (number == 0) return 1;
        while (number > 0) {
            if ((number % 10) % 2 == 0) count++;
            number /= 10;
        }
        return count;
    }

    public static int countOdd(int number) {
        int count = 0;
        number = Math.abs(number);
        while (number > 0) {
            if ((number % 10) % 2 != 0) count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Even digits: " + countEven(number));
        System.out.println("Odd digits: " + countOdd(number));
        sc.close();
    }
}
