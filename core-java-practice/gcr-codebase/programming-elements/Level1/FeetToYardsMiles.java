import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance in Feet: ");
        double distanceFeet = sc.nextDouble();
        double yards = distanceFeet / 3;
        double milesDistance = yards / 1760;
        System.out.println("Distance in Yards = " + yards);
        System.out.println("Distance in Miles = " + milesDistance);
        sc.close();
    }
}
