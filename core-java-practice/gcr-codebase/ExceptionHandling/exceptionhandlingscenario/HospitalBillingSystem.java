import java.util.Scanner;

public class HospitalBillingSystem {
    public static void main(String[] args) {
        int[] patientBills = {2500, 3700, 4200};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter patient index: ");
            String indexInput = scanner.nextLine();
            int patientIndex = Integer.parseInt(indexInput);

            System.out.print("Enter total items billed: ");
            String itemCountInput = scanner.nextLine();
            int itemCount = Integer.parseInt(itemCountInput);

            int billAmount = patientBills[patientIndex];
            int averagePerItem = billAmount / itemCount;
            System.out.println("Average bill per item: " + averagePerItem);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: please enter numeric values only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index: please choose a valid patient.");
        } catch (ArithmeticException e) {
            System.out.println("Billing error: item count cannot be zero.");
        } finally {
            scanner.close();
        }
    }
}
