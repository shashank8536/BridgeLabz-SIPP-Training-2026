// Create AbundantNumber class to check if a number is an Abundant Number or not.
import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get an integer input for the number variable
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Create an integer variable sum with initial value 0 to hold sum of divisors
        int sum = 0;

        // Run a for loop from i = 1 to i < number to find proper divisors
        for (int i = 1; i < number; i++) {
            // Inside the loop, check if number is divisible by i
            if (number % i == 0) {
                // If true, add i to sum
                sum += i;
            }
        }

        // Outside the loop, check if sum is greater than number
        boolean isAbundant = (sum > number);

        // If the sum is greater than the number, print Abundant Number. Otherwise, print Not an Abundant Number.
        if (isAbundant) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        // Close the Scanner Stream
        input.close();
    }
}
