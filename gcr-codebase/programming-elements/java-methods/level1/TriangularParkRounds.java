import java.util.Scanner;

public class TriangularParkRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();
        
        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();
        
        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();
        
        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + rounds + " rounds to finish a 5 km run.");
        
        sc.close();
    }
    
    public static double calculateRounds(double s1, double s2, double s3) {
        double perimeter = s1 + s2 + s3;
        double targetDistance = 5000; // 5 km = 5000 meters
        return targetDistance / perimeter;
    }
}
