// Create MultiplicationTable class to find the multiplication table of a number from 6 to 9.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Take integer input and store it in the variable number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Using a for loop, find the multiplication table of number from 6 to 9 and print it
        for (int i = 6; i <= 9; i++) {
            // Store the result of multiplication in a variable
            int result = number * i;

            // Print in the format number * i = result
            System.out.println(number + " * " + i + " = " + result);
        }

        // Close the Scanner Stream
        input.close();
    }
}
