public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 1000.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + " | Vehicle: " + vehicleType + " | Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Asha", "Car");
        Vehicle v2 = new Vehicle("Kiran", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(2500.0);
        v1.displayVehicleDetails();
    }
}
