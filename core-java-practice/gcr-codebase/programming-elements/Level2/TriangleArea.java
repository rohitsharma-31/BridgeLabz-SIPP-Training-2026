import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Area of Triangle -----");
        System.out.print("Enter base (cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);

        System.out.println("Area in square cm = " + areaCm);
        System.out.println("Area in square inches = " + areaIn);

        sc.close();
    }
}
