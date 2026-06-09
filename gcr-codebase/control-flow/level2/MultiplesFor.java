// Create MultiplesFor class to find all the multiples of a number taken as user input below 100.
import java.util.Scanner;

public class MultiplesFor {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get the input value for a variable named number
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        // Check if the number is a positive integer and less than 100
        if (number > 0 && number < 100) {
            System.out.print("Multiples of " + number + " below 100: ");

            // Run a for loop backward: from i = 100 to i = 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is a multiple of number (number perfectly divides i)
                if (i % number == 0) {
                    // Print i and continue the loop
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Error: Please enter a positive integer less than 100.");
        }

        // Close the Scanner Stream
        input.close();
    }
}
