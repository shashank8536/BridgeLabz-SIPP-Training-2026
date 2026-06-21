import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input x = ");
        int x = sc.nextInt();
        System.out.print("Input n = ");
        int n = sc.nextInt();
        
        System.out.println("\nOutput:\n" + power(x, n));
        sc.close();
    }
    
    public static long power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
