// Create SwitchCalculator class to perform arithmetic operations.
// Note: We omit the loop "for i = 1 to i < number" described in the hint 
// because 'number' is not defined for this program (this is a copy-paste typo from Abundant Number).
import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Create two double variables named first and second and a String variable named op
        System.out.print("Enter first number (double): ");
        double first = input.nextDouble();

        System.out.print("Enter second number (double): ");
        double second = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        // Double variable to hold the calculated result
        double result = 0.0;

        // Boolean flag to track validity of the operation
        boolean isValidOperation = true;

        // Based on the input value of the op, perform specific operations using switch...case statement
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                // Check if denominator is zero
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                    isValidOperation = false;
                }
                break;
            default:
                // If op is neither of those 4 values, print Invalid Operator.
                System.out.println("Invalid Operator");
                isValidOperation = false;
                break;
        }

        // Print the result if valid
        if (isValidOperation) {
            System.out.println("Result: " + first + " " + op + " " + second + " = " + result);
        }

        // Close the Scanner Stream
        input.close();
    }
}
