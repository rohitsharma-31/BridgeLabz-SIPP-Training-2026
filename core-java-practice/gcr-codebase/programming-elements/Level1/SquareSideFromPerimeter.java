import java.util.Scanner;

public class SquareSideFromPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Perimeter: ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.println("Side = " + side + " (Perimeter = " + perimeter + ")");
        sc.close();
    }
}
