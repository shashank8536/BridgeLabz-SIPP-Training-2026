import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "expenses.txt";

        System.out.println("--- Daily Expense Logger ---");
        System.out.println("Enter your expenses. Type 'exit' to stop.");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            while (true) {
                System.out.print("Enter expense category (e.g., Food, Travel) or 'exit': ");
                String category = scanner.nextLine().trim();
                
                if (category.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Enter amount: ");
                String amount = scanner.nextLine().trim();

                writer.write(category + " - " + amount);
                writer.newLine();
                System.out.println("Expense logged!\n");
            }
            System.out.println("All expenses saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving expense to file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
