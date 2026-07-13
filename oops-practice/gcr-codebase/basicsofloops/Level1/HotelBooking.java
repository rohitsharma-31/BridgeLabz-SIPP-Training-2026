public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Unknown", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this(other.guestName, other.roomType, other.nights);
    }

    public void displayBooking() {
        System.out.println("Booking: " + guestName + " | Room: " + roomType + " | Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Priya", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2);
        booking1.displayBooking();
        booking2.displayBooking();
        booking3.displayBooking();
    }
}
