import java.util.Scanner;

public class ConsecutiveSensorReadings {
    
    public static boolean isStrictlyIncreasing(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true;
        }
        if (arr[index] >= arr[index + 1]) {
            return false;
        }
        return isStrictlyIncreasing(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of readings: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("No readings provided.");
            sc.close();
            return;
        }
        
        int[] readings = new int[n];
        System.out.println("Enter the readings:");
        for (int i = 0; i < n; i++) {
            readings[i] = sc.nextInt();
        }
        
        boolean result = isStrictlyIncreasing(readings, 0);
        System.out.println("Output: " + result);
        
        sc.close();
    }
}
