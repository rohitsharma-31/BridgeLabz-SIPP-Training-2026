public class ATMWithdrawalSystem {
    public static void main(String[] args) {
        double accountBalance = 5000.0;
        double withdrawalRequest = 8000.0;

        try {
            withdraw(accountBalance, withdrawalRequest);
            System.out.println("Withdrawal completed successfully.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
            System.out.println("Available balance: " + e.getBalance());
            System.out.println("Requested amount: " + e.getRequestedAmount());
        }
    }

    private static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        double remaining = balance - amount;
        System.out.println("Withdrawal successful. Remaining balance: " + remaining);
    }
}
