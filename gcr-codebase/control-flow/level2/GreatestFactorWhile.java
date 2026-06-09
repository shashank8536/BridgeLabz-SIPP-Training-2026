// Create GreatestFactorWhile class to find the greatest factor beside itself using a while loop.
import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get an integer input and assign it to the number variable
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Define a greatestFactor variable and assign it to 1
        int greatestFactor = 1;

        // Create a variable counter and assign counter = number - 1
        int counter = number - 1;

        // Use the while loop till the counter is equal to 1
        // (we run down to 1, checking counter >= 1)
        while (counter >= 1) {
            // Check if the number is perfectly divisible by the counter
            if (number % counter == 0) {
                // Assign counter to greatestFactor variable
                greatestFactor = counter;

                // Break the loop
                break;
            }

            // Decrement the counter
            counter--;
        }

        // Display the greatestFactor variable outside the loop
        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);

        // Close the Scanner Stream
        input.close();
    }
}
