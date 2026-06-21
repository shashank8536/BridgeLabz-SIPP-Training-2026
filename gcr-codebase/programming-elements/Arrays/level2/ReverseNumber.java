package Arrays.level2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = Math.abs(sc.nextLong());
        
        long temp = number;
        int count = 0;
        if (temp == 0) count = 1;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }
        
        int[] reversedArray = new int[count];
        for (int i = 0; i < count; i++) {
            reversedArray[i] = digits[i];
        }
        
        System.out.print("Reversed Array Elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
