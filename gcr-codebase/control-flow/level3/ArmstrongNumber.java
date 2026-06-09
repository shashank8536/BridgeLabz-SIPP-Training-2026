// Create ArmstrongNumber class to check if a number is an Armstrong number or not.
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get an integer input and store it in the number variable
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define sum variable and initialize it to zero
        int sum = 0;

        // Define originalNumber variable and assign it to input number variable
        int originalNumber = number;

        // Use the while loop till the originalNumber is not equal to zero
        while (originalNumber != 0) {
            // Find each digit which is the remainder of the modulus operation on originalNumber
            int digit = originalNumber % 10;

            // Find the cube of the digit and add it to the sum variable
            int cube = digit * digit * digit;
            sum += cube;

            // Find the quotient of the originalNumber using the division operation by 10
            // and assign it back to originalNumber. This removes the last digit.
            originalNumber = originalNumber / 10;
        }

        // Check if the original number and the sum are the same
        boolean isArmstrong = (number == sum);

        // Display results accordingly
        if (isArmstrong) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }

        // Close the Scanner Stream
        input.close();
    }
}
