// Create LeapYear class to check if a year is a Leap Year or not.
// This program only works for year >= 1582 (Gregorian calendar).
// It uses multiple if-else statements to determine the leap year status.
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get integer input for year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Fixed variable for Gregorian calendar start year
        int gregorianStartYear = 1582;

        // Boolean variable to store result of leap year check
        boolean isLeapYear = false;

        // Check if the year is valid (>= 1582)
        if (year >= gregorianStartYear) {
            // Nested if-else statements based on divisibility rules
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    } else {
                        isLeapYear = false;
                    }
                } else {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = false;
            }

            // Display the result based on check
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
