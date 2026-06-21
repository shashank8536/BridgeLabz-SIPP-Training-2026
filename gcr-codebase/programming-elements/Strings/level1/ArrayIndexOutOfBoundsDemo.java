package Strings.level1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] names) {
        System.out.println(names[names.length + 2]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length + 2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 names separated by space: ");
        String[] names = new String[3];
        for (int i = 0; i < 3; i++) {
            names[i] = sc.next();
        }
        
        System.out.println("Handling the exception:");
        handleException(names);
        
        System.out.println("\nGenerating the exception:");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception generated and caught in main: " + e);
        }
        
        sc.close();
    }
}
