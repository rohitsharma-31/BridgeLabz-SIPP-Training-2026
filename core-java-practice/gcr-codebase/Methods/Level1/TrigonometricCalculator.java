import java.util.Scanner;

public class TrigonometricCalculator {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[] {sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("sin(" + angle + ") = " + results[0]);
        System.out.println("cos(" + angle + ") = " + results[1]);
        System.out.println("tan(" + angle + ") = " + results[2]);
        sc.close();
    }
}
