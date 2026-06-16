import java.util.Scanner;

public class DoubleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Double Operations -----");
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
