package Arrays.level2;

import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            while (true) {
                System.out.print("Enter weight (kg): ");
                double w = sc.nextDouble();
                System.out.print("Enter height (m): ");
                double h = sc.nextDouble();
                
                if (w > 0 && h > 0) {
                    personData[i][0] = w;
                    personData[i][1] = h;
                    break;
                } else {
                    System.out.println("Please enter positive values only.");
                }
            }
            
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            double bmi = personData[i][2];
            
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("\nHeight(m)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n", personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        
        sc.close();
    }
}
