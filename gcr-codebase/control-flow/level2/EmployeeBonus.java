
// Create EmployeeBonus class to calculate the bonus amount of an employee based on years of service.
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Take salary and year of service as input
        System.out.print("Enter salary of the employee: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        double yearsOfService = input.nextDouble();

        // Initialize variables for bonus amount and rate
        double bonusAmount = 0.0;
        double bonusRate = 0.05; // 5% bonus rate

        // Check if the year of service is more than 5 years
        if (yearsOfService > 5.0) {
            bonusAmount = salary * bonusRate;
        }

        // Print the calculated bonus amount
        System.out.println("The employee's bonus amount is: " + bonusAmount);

        // Close the Scanner Stream
        input.close();
    }
}
