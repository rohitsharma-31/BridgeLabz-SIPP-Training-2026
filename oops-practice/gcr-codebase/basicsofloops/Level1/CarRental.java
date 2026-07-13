public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental() {
        this("Unknown", "Standard", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost(double dailyRate) {
        return rentalDays * dailyRate;
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Neha", "Tesla Model 3", 5);
        System.out.println("Total rental cost: " + rental.calculateTotalCost(1200.0));
    }
}
