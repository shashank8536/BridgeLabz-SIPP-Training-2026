package Arrays.level2;

import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];
        
        int i = 0;
        while (i < n) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Marks in Physics: ");
            int p = sc.nextInt();
            System.out.print("Marks in Chemistry: ");
            int c = sc.nextInt();
            System.out.print("Marks in Maths: ");
            int m = sc.nextInt();
            
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Please enter positive marks.");
                continue;
            }
            
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
            percentages[i] = (p + c + m) / 3.0;
            
            if (percentages[i] >= 80) grades[i] = "A";
            else if (percentages[i] >= 70) grades[i] = "B";
            else if (percentages[i] >= 60) grades[i] = "C";
            else if (percentages[i] >= 50) grades[i] = "D";
            else if (percentages[i] >= 40) grades[i] = "E";
            else grades[i] = "R";
            
            i++;
        }
        
        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int j = 0; j < n; j++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f%%\t\t%s\n", marks[j][0], marks[j][1], marks[j][2], percentages[j], grades[j]);
        }
        
        sc.close();
    }
}
