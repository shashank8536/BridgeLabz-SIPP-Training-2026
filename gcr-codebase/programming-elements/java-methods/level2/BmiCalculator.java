import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight for person " + (i + 1) + " (in kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height for person " + (i + 1) + " (in cm): ");
            data[i][1] = sc.nextDouble();
        }
        
        calculateBmi(data);
        String[] statuses = determineBmiStatus(data);
        
        System.out.println("\nPerson | Weight (kg) | Height (cm) | BMI | Status");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d      | %.2f       | %.2f       | %.2f | %s\n", (i + 1), data[i][0], data[i][1], data[i][2], statuses[i]);
        }
        
        sc.close();
    }
    
    public static void calculateBmi(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0;
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }
    
    public static String[] determineBmiStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
}
