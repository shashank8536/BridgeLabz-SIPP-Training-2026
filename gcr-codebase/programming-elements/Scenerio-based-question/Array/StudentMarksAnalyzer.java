import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        
        System.out.println("Enter marks:");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int above75 = 0;
        double sum = 0;
        
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            if (marks[i] > max) max = marks[i];
            if (marks[i] < min) min = marks[i];
            if (marks[i] > 75) above75++;
            sum += marks[i];
        }
        
        double avg = sum / n;
        
        System.out.println("Highest marks: " + max);
        System.out.println("Lowest marks: " + min);
        System.out.println("Students scoring above 75: " + above75);
        System.out.println("Average marks: " + avg);
        System.out.print("Marks greater than average: ");
        
        for (int i = 0; i < n; i++) {
            if (marks[i] > avg) {
                System.out.print(marks[i] + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
