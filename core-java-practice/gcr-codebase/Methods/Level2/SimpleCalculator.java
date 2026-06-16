import java.util.Scanner;

public class SimpleCalculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return b == 0 ? Double.NaN : a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        System.out.println("Addition: " + add(first, second));
        System.out.println("Subtraction: " + subtract(first, second));
        System.out.println("Multiplication: " + multiply(first, second));
        if (second == 0) {
            System.out.println("Division: Cannot divide by zero.");
        } else {
            System.out.println("Division: " + divide(first, second));
        }
        sc.close();
    }
}
