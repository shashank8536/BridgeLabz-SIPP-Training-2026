// Create BmiCalculator class to calculate BMI and determine weight status.
import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Take user input in double for weight (in kg) and height (in cm)
        System.out.print("Enter weight of the person (in kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter height of the person (in cm): ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100.0;

        // Calculate BMI using formula: BMI = weight / (height * height) in kg/m^2
        double bmi = weight / (heightMeters * heightMeters);

        // Define string variable to store weight status
        String weightStatus = "";

        // Determine status based on BMI table
        if (bmi <= 18.4) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            weightStatus = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            weightStatus = "Overweight";
        } else { // bmi >= 40.0
            weightStatus = "Obese";
        }

        // Display the results: weight, height, BMI value, and weight status
        System.out.println("\n--- BMI Calculation Results ---");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + heightCm + " cm (" + heightMeters + " m)");
        System.out.println("Calculated BMI: " + bmi);
        System.out.println("Weight Status: " + weightStatus);

        // Close the Scanner Stream
        input.close();
    }
}
