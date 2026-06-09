// Create FriendComparison class to find the youngest and the tallest among Amar, Akbar, and Anthony.
import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Take inputs for Amar
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = input.nextDouble();

        // Take inputs for Akbar
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = input.nextDouble();

        // Take inputs for Anthony
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = input.nextDouble();

        // Define string variables to store youngest and tallest friend names
        String youngestFriend = "";
        String tallestFriend = "";

        // Find the smallest of the 3 ages to find the youngest friend
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            youngestFriend = "Amar";
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the largest of the 3 heights to find the tallest friend
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            tallestFriend = "Amar";
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display the youngest and tallest friend
        System.out.println("Youngest Friend: " + youngestFriend);
        System.out.println("Tallest Friend: " + tallestFriend);

        // Close the Scanner Stream
        input.close();
    }
}
