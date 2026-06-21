import java.util.Scanner;

public class ChocolatesDistribution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = in.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = in.nextInt();
        
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Each child will get " + result[1] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[0]);
        
        in.close();
    }
    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }
}
