package Strings.level1;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // start > end
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) { 
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text (length > 5): ");
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
