import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in KM: ");
        double userKm = sc.nextDouble();
        double userMiles = userKm / 1.6;
        System.out.println(userKm + " km = " + userMiles + " miles");
        sc.close();
    }
}
