import java.util.Scanner;

public class PrimeRangeLevel3 {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void printPrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range start: ");
        int start = sc.nextInt();
        System.out.print("Enter range end: ");
        int end = sc.nextInt();
        if (start > end) {
            System.out.println("Invalid range. Start should be less than or equal to end.");
        } else {
            printPrimesInRange(start, end);
        }
        sc.close();
    }
}
