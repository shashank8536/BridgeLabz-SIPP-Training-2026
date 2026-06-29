import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int goodCount = 0;

        System.out.println("Enter 5 customer feedback messages:");

        for (int i = 1; i <= 5; i++) {
            try {
                System.out.print("Feedback " + i + ": ");
                String feedback = reader.readLine();
                
                if (feedback != null && feedback.toLowerCase().contains("good")) {
                    goodCount++;
                }
            } catch (IOException e) {
                System.out.println("Error reading input: " + e.getMessage());
            }
        }

        System.out.println("\nGood Feedback Count = " + goodCount);
    }
}
