import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N = ");
        int n = sc.nextInt();
        System.out.println("Output:\n" + sum(n));
        sc.close();
    }
    
    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
}
