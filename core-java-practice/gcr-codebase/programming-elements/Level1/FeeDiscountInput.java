import java.util.Scanner;

public class FeeDiscountInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fee: ");
        double userFee = sc.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        double userDiscountPercent = sc.nextDouble();
        double userDiscount = userFee * userDiscountPercent / 100;
        double userFinalFee = userFee - userDiscount;
        System.out.println("Discount Amount = INR " + userDiscount + ", Final Fee = INR " + userFinalFee);
        sc.close();
    }
}
