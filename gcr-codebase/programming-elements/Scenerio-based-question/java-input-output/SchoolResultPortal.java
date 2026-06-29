import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SchoolResultPortal {
    public static void main(String[] args) {
        String inputFile = "students.txt";
        String outputFile = "report_card.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {

            String line;
            writer.write("--- Student Report Cards ---\n");
            
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                
                String[] parts = line.split(",");
                if (parts.length < 2) {
                    continue;
                }

                String name = parts[0].trim();
                double sum = 0;
                int count = 0;

                for (int i = 1; i < parts.length; i++) {
                    try {
                        sum += Double.parseDouble(parts[i].trim());
                        count++;
                    } catch (NumberFormatException e) {
                        // Skip invalid marks
                    }
                }

                double average = count > 0 ? sum / count : 0.0;
                
                writer.write("Student Name: " + name + "\n");
                writer.write("Average Marks: " + String.format("%.2f", average) + "\n");
                writer.write("---------------------------\n");
            }
            
            System.out.println("Report cards successfully generated and appended to " + outputFile);

        } catch (FileNotFoundException e) {
            System.out.println("Error: The input file '" + inputFile + "' was not found.");
            System.out.println("Please create the file with student marks (e.g. Name,80,90,85) first.");
        } catch (IOException e) {
            System.out.println("An error occurred during file operations: " + e.getMessage());
        }
    }
}
