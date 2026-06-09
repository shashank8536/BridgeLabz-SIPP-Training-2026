// Create DayOfWeek class to find the day of the week for a given date.
// It takes three command-line arguments: m (month), d (day), and y (year).
public class DayOfWeek {
    public static void main(String[] args) {
        // Check if exactly three command-line arguments are provided
        if (args.length != 3) {
            System.out.println("Error: Please provide exactly 3 command-line arguments: m (month), d (day), and y (year).");
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        // Parse the input arguments
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Calculate helper year variable y0 using integer division
        int y0 = y - (14 - m) / 12;

        // Calculate helper leap year correction term x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Calculate helper month variable m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Calculate day of week d0 using the modulo 7 operator
        // 0 for Sunday, 1 for Monday, 2 for Tuesday, and so on.
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Handle negative result if any calculation drops below 0 (defensive programming)
        if (d0 < 0) {
            d0 += 7;
        }

        // Display results
        System.out.println("Date: Month = " + m + ", Day = " + d + ", Year = " + y);
        System.out.println("Day of the Week (0=Sunday, 1=Monday, ...): " + d0);
    }
}
