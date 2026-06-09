// Create FizzBuzzWhile class to run the FizzBuzz game using a while loop.
import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Take the user input number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number > 0) {
            // Counter variable initialized to 1
            int counter = 1;

            // Using a while loop, iterate from 1 to the number
            while (counter <= number) {
                // Check if multiple of both 3 and 5
                if (counter % 3 == 0 && counter % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if multiple of 3
                else if (counter % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if multiple of 5
                else if (counter % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Otherwise print the number itself
                else {
                    System.out.println(counter);
                }

                // Increment counter in each iteration
                counter++;
            }
        } else {
            System.out.println("Error: Please enter a positive integer.");
        }

        // Close the Scanner Stream
        input.close();
    }
}
