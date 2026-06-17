import java.util.InputMismatchException;
import java.util.Scanner;

public class BankTransactionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter current balance: ");
            double balance = scanner.nextDouble();
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            BankAccount account = new BankAccount(balance);
            account.withdraw(amount);
            System.out.println("Withdrawal successful, new balance: " + account.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }

    private static class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public void withdraw(double amount) throws InsufficientBalanceException {
            if (amount < 0) {
                throw new IllegalArgumentException("Withdrawal amount cannot be negative");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Not enough balance");
            }
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }
    }
}
