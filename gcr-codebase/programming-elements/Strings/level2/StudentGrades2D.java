package Strings.level2;

import java.util.Scanner;

public class StudentGrades2D {
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 61) + 40; 
            scores[i][1] = (int) (Math.random() * 61) + 40; 
            scores[i][2] = (int) (Math.random() * 61) + 40; 
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double pct = (total / 300.0) * 100;
            
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(pct * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double pct = stats[i][2];
            if (pct >= 80) grades[i] = "A";
            else if (pct >= 70) grades[i] = "B";
            else if (pct >= 60) grades[i] = "C";
            else if (pct >= 50) grades[i] = "D";
            else if (pct >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("\nStu\tPhy\tChe\tMat\tTotal\tAvg\tPct\tGrade");
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f%%\t%s\n",
                i + 1, scores[i][0], scores[i][1], scores[i][2], stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
        
        sc.close();
    }
}
