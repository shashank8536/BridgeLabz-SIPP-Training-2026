// Create FactorsFor class to find proper factors of a number using a for loop.
import java.util.Scanner;

public class FactorsFor {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get the input value for variable number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if number is a positive integer
        if (number > 0) {
            System.out.print("Factors of " + number + " (excluding itself): ");

            // Run a for loop from i = 1 to i < number
            for (int i = 1; i < number; i++) {
                // Check if number is perfectly divisible by i
                if (number % i == 0) {
                    // Print the value of i
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Error: Please enter a positive integer.");
        }

        // Close the Scanner Stream
        input.close();
    }
}
