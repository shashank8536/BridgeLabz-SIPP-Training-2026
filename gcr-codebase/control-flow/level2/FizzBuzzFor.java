// Create FizzBuzzFor class to run the FizzBuzz game using a for loop.
import java.util.Scanner;

public class FizzBuzzFor {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Take the user input number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number > 0) {
            // Using a for loop, iterate from 1 to the number
            for (int i = 1; i <= number; i++) {
                // Check if multiple of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if multiple of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if multiple of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Otherwise print the number
                else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Error: Please enter a positive integer.");
        }

        // Close the Scanner Stream
        input.close();
    }
}
