import java.util.Scanner;

public class TriangleRunRounds {
    public static int calculateRounds(double a, double b, double c, double targetDistanceMeters) {
        double perimeter = a + b + c;
        return (int) Math.ceil(targetDistanceMeters / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a (meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side b (meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side c (meters): ");
        double c = sc.nextDouble();

        int rounds = calculateRounds(a, b, c, 5000);
        System.out.println("Rounds required to complete 5 km: " + rounds);
        sc.close();
    }
}
