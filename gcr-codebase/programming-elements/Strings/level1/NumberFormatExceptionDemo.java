package Strings.level1;

import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Number is: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-numeric string: ");
        String text = sc.next();
        
        System.out.println("Handling the exception:");
        handleException(text);
        
        System.out.println("\nGenerating the exception:");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception generated and caught in main: " + e);
        }
        
        sc.close();
    }
}
