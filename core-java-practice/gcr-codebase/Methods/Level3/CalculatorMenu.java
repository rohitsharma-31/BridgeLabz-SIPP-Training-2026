import java.util.Scanner;

public class CalculatorMenu {
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
        System.out.println("Calculator Menu");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Choose an option: ");
        int option = sc.nextInt();
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        switch (option) {
            case 1:
                System.out.println("Result: " + add(first, second));
                break;
            case 2:
                System.out.println("Result: " + subtract(first, second));
                break;
            case 3:
                System.out.println("Result: " + multiply(first, second));
                break;
            case 4:
                if (second == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + divide(first, second));
                }
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        sc.close();
    }
}
