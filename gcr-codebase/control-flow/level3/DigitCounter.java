// Create DigitCounter class to count the number of digits in an integer.
import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get an integer input for the number variable
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Create an integer variable count with value 0
        int count = 0;

        // Store the original number to preserve it for the final output
        int originalNumber = number;

        // If the number is 0, the digit count is 1
        if (number == 0) {
            count = 1;
        } else {
            // Use a loop to iterate until number is not equal to 0
            while (number != 0) {
                // Remove the last digit from number in each iteration by division
                number = number / 10;

                // Increase count by 1 in each iteration
                count++;
            }
        }

        // Display the count to show the number of digits
        System.out.println("The number of digits in " + originalNumber + " is " + count);

        // Close the Scanner Stream
        input.close();
    }
}
