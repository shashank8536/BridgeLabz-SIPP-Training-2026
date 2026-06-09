// Create OddEvenFinder class to print odd and even numbers between 1 and the entered number.
import java.util.Scanner;

public class OddEvenFinder {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user, assign to variable number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for Natural Number
        if (number > 0) {
            // Using a for loop, iterate from 1 to the number
            for (int i = 1; i <= number; i++) {
                // Check if the current value is divisible by 2
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            // Print message if it is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the Scanner Stream
        input.close();
    }
}
