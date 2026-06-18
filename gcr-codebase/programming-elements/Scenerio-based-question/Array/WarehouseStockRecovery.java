import java.util.Scanner;

public class WarehouseStockRecovery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        int[] stock = new int[n];
        
        System.out.println("Enter stock quantities:");
        int zeroPos = -1;
        double sum = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
            if (stock[i] == 0) {
                zeroPos = i;
            } else {
                sum += stock[i];
                count++;
            }
        }
        
        int avgStock = 0;
        if (count > 0) {
            avgStock = (int) (sum / count);
        }
        
        if (zeroPos != -1) {
            System.out.println("Stock became 0 at position: " + zeroPos);
            System.out.println("Average stock of non-zero products: " + avgStock);
            stock[zeroPos] = avgStock;
        }
        
        System.out.print("Updated inventory: ");
        for (int i = 0; i < n; i++) {
            System.out.print(stock[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
