// Create FactorsWhile class to find proper factors of a number using a while loop.
import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get the input value for variable number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if number is a positive integer
        if (number > 0) {
            System.out.print("Factors of " + number + " (excluding itself): ");

            // Create a counter variable and initialize it to 1
            int counter = 1;

            // Run the while loop till the counter is less than the user input number
            while (counter < number) {
                // Check if number is perfectly divisible by counter
                if (number % counter == 0) {
                    // Print the value of counter
                    System.out.print(counter + " ");
                }
                
                // Increment counter in each iteration
                counter++;
            }
            System.out.println();
        } else {
            System.out.println("Error: Please enter a positive integer.");
        }

        // Close the Scanner Stream
        input.close();
    }
}
