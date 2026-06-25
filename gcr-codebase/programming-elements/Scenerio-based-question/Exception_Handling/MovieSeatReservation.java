// Movie Seat Reservation
// An array stores booked seat numbers: int seats[] = {101,102,103,104,105};
// Scenario: A customer requests a seat at position 8.

public class MovieSeatReservation {
    private static int[] seats = {101, 102, 103, 104, 105};

    public static void main(String[] args) {
        int requestedPosition = 8;
        int seatNumber = getSeat(requestedPosition);
        
        if (seatNumber != -1) {
            System.out.println("Seat successfully booked: " + seatNumber);
        } else {
            System.out.println("Seat reservation failed for position " + requestedPosition + ".");
        }
    }

    public static int getSeat(int index) {
        try {
            // Attempt to access the seat at the given index
            int seatNumber = seats[index];
            return seatNumber;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the invalid access exception here
            System.out.println("Error: Invalid seat position. No seat found at index " + index + ".");
            return -1;
        }
    }
}
