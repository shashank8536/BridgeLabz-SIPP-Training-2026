// Create GreatestFactorFor class to find the greatest factor beside itself using a for loop.
import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get an integer input and assign it to the number variable
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Define a greatestFactor variable and assign it to 1
        int greatestFactor = 1;

        // Create a for loop that runs from i = number - 1 to i = 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                // Assign i to greatestFactor
                greatestFactor = i;
                
                // Break out of the loop
                break;
            }
        }

        // Display the greatestFactor variable outside the loop
        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);

        // Close the Scanner Stream
        input.close();
    }
}
