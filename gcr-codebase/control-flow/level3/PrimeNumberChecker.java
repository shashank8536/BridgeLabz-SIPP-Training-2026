// Create PrimeNumberChecker class to check if a number is a prime number.
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get integer input for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Boolean variable to store the result of prime check, default to true
        boolean isPrime = true;

        // Prime checks are done for numbers greater than 1
        if (number > 1) {
            // Loop through all numbers from 2 to number - 1
            for (int i = 2; i < number; i++) {
                // Check if remainder is zero
                if (number % i == 0) {
                    // Number is divisible by some other number, so it is not prime
                    isPrime = false;
                    // Break out of the loop
                    break;
                }
            }

            // Display results based on isPrime variable
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is not a Prime Number.");
            }
        } else {
            // Numbers less than or equal to 1 are not prime
            isPrime = false;
            System.out.println(number + " is not a Prime Number.");
        }

        // Close the Scanner Stream
        input.close();
    }
}
