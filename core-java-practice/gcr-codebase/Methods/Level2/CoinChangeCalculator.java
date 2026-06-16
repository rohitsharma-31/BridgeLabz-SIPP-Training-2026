import java.util.Scanner;

public class CoinChangeCalculator {
    public static void calculateChange(int cents) {
        int quarters = cents / 25;
        cents %= 25;
        int dimes = cents / 10;
        cents %= 10;
        int nickels = cents / 5;
        cents %= 5;
        int pennies = cents;

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter change in cents: ");
        int cents = sc.nextInt();
        if (cents < 0) {
            System.out.println("Please enter a non-negative amount.");
        } else {
            calculateChange(cents);
        }
        sc.close();
    }
}
