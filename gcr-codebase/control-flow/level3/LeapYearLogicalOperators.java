// Create LeapYearLogicalOperators class to check if a year is a Leap Year.
// This program only works for year >= 1582 (Gregorian calendar).
// It uses a single if condition with logical && and || operators.
import java.util.Scanner;

public class LeapYearLogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get integer input for year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Fixed variable for Gregorian calendar start year
        int gregorianStartYear = 1582;

        // Check if the year is valid (>= 1582)
        if (year >= gregorianStartYear) {
            // Determine leap year status in a single expression using logical && and || operators
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            // Display the result
            if (isLeapYear) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("The LeapYear program only works for year >= " + gregorianStartYear);
        }

        // Close the Scanner Stream
        input.close();
    }
}
