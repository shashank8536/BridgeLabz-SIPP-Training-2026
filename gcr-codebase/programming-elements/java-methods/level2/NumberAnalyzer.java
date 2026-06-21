import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] == 0) {
                System.out.println(numbers[i] + " is zero.");
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }
        
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        int compResult = compare(first, last);
        
        if (compResult == 1) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ")");
        } else if (compResult == -1) {
            System.out.println("First element (" + first + ") is less than last element (" + last + ")");
        } else {
            System.out.println("First element (" + first + ") is equal to last element (" + last + ")");
        }
        
        sc.close();
    }
    
    public static boolean isPositive(int number) {
        return number > 0;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }
}
