public class ProfitAndLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;
        System.out.println("Cost Price = INR " + costPrice + ", Selling Price = INR " + sellingPrice);
        System.out.println("Profit = INR " + profit + ", Profit% = " + profitPercent);
    }
}
