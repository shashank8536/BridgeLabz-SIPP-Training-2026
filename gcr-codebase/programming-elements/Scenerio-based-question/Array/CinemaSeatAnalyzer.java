import java.util.Scanner;

public class CinemaSeatAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of seats: ");
        int n = sc.nextInt();
        int[] seats = new int[n];
        
        System.out.println("Enter seat status (0 for Empty, 1 for Booked):");
        int booked = 0;
        int available = 0;
        
        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
            if (seats[i] == 1) {
                booked++;
            } else {
                available++;
            }
        }
        
        int maxEmpty = 0;
        int currentEmpty = 0;
        int maxStart = -1;
        int maxEnd = -1;
        int tempStart = -1;
        
        for (int i = 0; i < n; i++) {
            if (seats[i] == 0) {
                if (currentEmpty == 0) {
                    tempStart = i;
                }
                currentEmpty++;
                if (currentEmpty > maxEmpty) {
                    maxEmpty = currentEmpty;
                    maxStart = tempStart;
                    maxEnd = i;
                }
            } else {
                currentEmpty = 0;
            }
        }
        
        System.out.println("Total booked seats: " + booked);
        System.out.println("Total available seats: " + available);
        
        if (maxEmpty > 0) {
            System.out.println("Longest continuous block of available seats: " + maxEmpty);
            System.out.println("Starting position: " + maxStart);
            System.out.println("Ending position: " + maxEnd);
        } else {
            System.out.println("No available seats.");
        }
        
        if (maxEmpty >= 5) {
            System.out.println("A group of 5 people can sit together.");
        } else {
            System.out.println("A group of 5 people cannot sit together.");
        }
        
        sc.close();
    }
}
