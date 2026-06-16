import java.util.Scanner;

public class FactorsStatistics {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sum(int[] factors) {
        int result = 0;
        for (int factor : factors) result += factor;
        return result;
    }

    public static int product(int[] factors) {
        int result = 1;
        for (int factor : factors) result *= factor;
        return result;
    }

    public static double sumOfSquares(int[] factors) {
        double result = 0;
        for (int factor : factors) result += Math.pow(factor, 2);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        System.out.println("Factors:");
        for (int factor : factors) System.out.print(factor + " ");
        System.out.println();
        System.out.println("Sum: " + sum(factors));
        System.out.println("Sum of squares: " + sumOfSquares(factors));
        System.out.println("Product: " + product(factors));
        sc.close();
    }
}
