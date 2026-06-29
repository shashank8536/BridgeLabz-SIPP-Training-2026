import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GroceryBillReader {
    public static void main(String[] args) {
        String fileName = "bill.txt";
        int lineCount = 0;

        System.out.println("Reading contents of " + fileName + ":\n");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }
            System.out.println("\nTotal number of lines in the file: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
            System.out.println("Please create '" + fileName + "' in the project directory first.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
