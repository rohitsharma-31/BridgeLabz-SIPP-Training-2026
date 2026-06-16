import java.util.Scanner;

public class GCDLCMCalculator {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a / gcd(a, b) * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int first = sc.nextInt();
        System.out.print("Enter second integer: ");
        int second = sc.nextInt();

        System.out.println("GCD: " + gcd(first, second));
        System.out.println("LCM: " + lcm(first, second));
        sc.close();
    }
}
