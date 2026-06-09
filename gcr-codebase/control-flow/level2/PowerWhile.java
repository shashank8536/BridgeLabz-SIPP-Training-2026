// Create PowerWhile class to find the power of a number using a while loop.
import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get integer input for two variables named number and power
        System.out.print("Enter base number: ");
        int number = input.nextInt();
        System.out.print("Enter power (exponent): ");
        int power = input.nextInt();

        // Check for non-negative power (power >= 0)
        if (power >= 0) {
            // Create a result variable with an initial value of 1
            long result = 1;

            // Create a temp variable counter and initialize to zero
            int counter = 0;

            // Use the while loop till counter == power
            while (counter < power) {
                // Multiply the result by the number
                result = result * number;

                // Increment the counter
                counter++;
            }

            // Finally, print the result
            System.out.println(number + "^" + power + " = " + result);
        } else {
            System.out.println("Error: Power (exponent) must be a non-negative integer.");
        }

        // Close the Scanner Stream
        input.close();
    }
}
