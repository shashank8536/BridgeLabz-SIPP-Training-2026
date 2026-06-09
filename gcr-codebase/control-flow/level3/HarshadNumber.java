// Create HarshadNumber class to check if a number is a Harshad Number or not.
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get an integer input for the number variable
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Create an integer variable sum with initial value 0 to store the sum of digits
        int sum = 0;

        // Store the original input number in a variable to preserve it
        int originalNumber = number;

        // Create a while loop to access each digit of the number
        // We use a temporary variable for digestion to keep originalNumber intact,
        // or modify number and then refer back to originalNumber.
        int tempNumber = number;
        while (tempNumber != 0) {
            // Get each digit using modulus
            int digit = tempNumber % 10;

            // Add each digit of the number to sum
            sum += digit;

            // Remove last digit from number
            tempNumber = tempNumber / 10;
        }

        // Check if the number is perfectly divisible by the sum of its digits
        // Guard against division by zero (e.g. if input is 0)
        boolean isHarshad = (sum != 0) && (originalNumber % sum == 0);

        // If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
        if (isHarshad) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }

        // Close the Scanner Stream
        input.close();
    }
}
