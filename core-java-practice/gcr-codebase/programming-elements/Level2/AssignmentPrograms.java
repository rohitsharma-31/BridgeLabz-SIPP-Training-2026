import java.util.Scanner;

public class AssignmentPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Basic Calculator
        System.out.println("----- Basic Calculator -----");
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;

        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);

        // 2. Area of Triangle
        System.out.println("\n----- Area of Triangle -----");
        System.out.print("Enter base (cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);

        System.out.println("Area in square cm = " + areaCm);
        System.out.println("Area in square inches = " + areaIn);

        // 3. Side of Square
        System.out.println("\n----- Side of Square -----");
        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of side is " + side);

        // 4. Distance in Yards and Miles
        System.out.println("\n----- Distance Converter -----");
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards = " + yards);
        System.out.println("Distance in miles = " + miles);

        // 5. Total Purchase Price
        System.out.println("\n----- Purchase Price -----");
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("Total purchase price = INR " + totalPrice);

        // 6. Quotient and Remainder
        System.out.println("\n----- Quotient and Remainder -----");
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        // 7. Int Operations
        System.out.println("\n----- Int Operations -----");
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        // 8. Double Operations
        System.out.println("\n----- Double Operations -----");
        System.out.print("Enter a: ");
        double da = sc.nextDouble();

        System.out.print("Enter b: ");
        double db = sc.nextDouble();

        System.out.print("Enter c: ");
        double dc = sc.nextDouble();

        double dResult1 = da + db * dc;
        double dResult2 = da * db + dc;
        double dResult3 = dc + da / db;
        double dResult4 = da % db + dc;

        System.out.println("a + b * c = " + dResult1);
        System.out.println("a * b + c = " + dResult2);
        System.out.println("c + a / b = " + dResult3);
        System.out.println("a % b + c = " + dResult4);

        sc.close();
    }
}
