public class InsufficientBalanceException extends Exception {
    private final double balance;
    private final double requestedAmount;

    public InsufficientBalanceException(double balance, double requestedAmount) {
        super("Insufficient balance: available=" + balance + ", requested=" + requestedAmount);
        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}
