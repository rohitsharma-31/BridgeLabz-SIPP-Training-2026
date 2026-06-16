import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        double base = sc.nextDouble();
        System.out.print("Enter Height: ");
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;
        System.out.println("Area in cm^2 = " + areaCm);
        System.out.println("Area in inch^2 = " + areaInches);
        sc.close();
    }
}
