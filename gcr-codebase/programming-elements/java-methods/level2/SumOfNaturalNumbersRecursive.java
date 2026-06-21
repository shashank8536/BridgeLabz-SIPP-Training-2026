import java.util.Scanner;

public class SumOfNaturalNumbersRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (n > 0): ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Not a natural number. Please enter a number greater than 0.");
        } else {
            int recursiveSum = findSumRecursive(n);
            int formulaSum = findSumFormula(n);
            
            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);
            
            if (recursiveSum == formulaSum) {
                System.out.println("Both computations match. Result is correct.");
            } else {
                System.out.println("Computations do not match.");
            }
        }
        sc.close();
    }
    
    public static int findSumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + findSumRecursive(n - 1);
    }
    
    public static int findSumFormula(int n) {
        return n * (n + 1) / 2;
    }
}
