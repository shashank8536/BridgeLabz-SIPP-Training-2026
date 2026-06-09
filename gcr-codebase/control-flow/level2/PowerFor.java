// Create PowerFor class to find the power of a number using a for loop.
import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get integer input for two variables - number and power
        System.out.print("Enter base number: ");
        int number = input.nextInt();
        System.out.print("Enter power (exponent): ");
        int power = input.nextInt();

        // Check if both the base and exponent are positive integers (power >= 0 is mathematically defined, but let's check power >= 0)
        if (power >= 0) {
            // Create a result variable with an initial value of 1
            long result = 1;

            // Run a for loop from i = 1 to i <= power
            for (int i = 1; i <= power; i++) {
                // In each iteration of the loop, multiply the result by the number
                result = result * number;
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
