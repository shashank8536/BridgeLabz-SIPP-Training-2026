// Create MultiplesWhile class to find all the multiples of a number taken as user input below 100 using a while loop.
import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Get the input value for a variable named number
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        // Check if the number is a positive integer and less than 100
        if (number > 0 && number < 100) {
            System.out.print("Multiples of " + number + " below 100: ");

            // Create a counter variable and initialize it to 100
            int counter = 100;

            // Use a while loop till the counter is greater than or equal to 1
            while (counter >= 1) {
                // Check if the counter is a multiple of number (number perfectly divides counter)
                if (counter % number == 0) {
                    // Print the counter
                    System.out.print(counter + " ");
                }
                
                // Decrement counter
                counter--;
            }
            System.out.println();
        } else {
            System.out.println("Error: Please enter a positive integer less than 100.");
        }

        // Close the Scanner Stream
        input.close();
    }
}
