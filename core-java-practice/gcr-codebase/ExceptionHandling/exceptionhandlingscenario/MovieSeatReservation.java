public class MovieSeatReservation {
    private static final int[] seats = {101, 102, 103, 104, 105};

    public static void main(String[] args) {
        int seatAtPosition = getSeat(8);
        if (seatAtPosition == -1) {
            System.out.println("Requested seat position is invalid.");
        } else {
            System.out.println("Seat number: " + seatAtPosition);
        }
    }

    public static int getSeat(int index) {
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Seat request failed: invalid seat position.");
            return -1;
        }
    }
}
