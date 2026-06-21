import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N = ");
        int n = sc.nextInt();
        System.out.println("Output: ");
        printNTo1(n);
        System.out.println();
        sc.close();
    }
    
    public static void printNTo1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNTo1(n - 1);
    }
}
