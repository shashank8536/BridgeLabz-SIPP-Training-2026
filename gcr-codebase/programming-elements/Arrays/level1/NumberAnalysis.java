package Arrays.level1;


import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and even");
                } else {
                    System.out.println(numbers[i] + " is positive and odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative");
            } else {
                System.out.println("zero");
            }
        }
        
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are equal");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than the last element");
        } else {
            System.out.println("First element is less than the last element");
        }
        sc.close();
    }
}
