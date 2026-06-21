package Strings.level3;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean checkIteration(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkRecursion(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return checkRecursion(text, start + 1, end - 1);
    }

    public static char[] reverseString(String text) {
        char[] rev = new char[text.length()];
        int j = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            rev[j++] = text.charAt(i);
        }
        return rev;
    }

    public static boolean checkArrays(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        
        boolean res1 = checkIteration(text);
        boolean res2 = checkRecursion(text, 0, text.length() - 1);
        boolean res3 = checkArrays(text);
        
        System.out.println("Iteration Check: " + res1);
        System.out.println("Recursion Check: " + res2);
        System.out.println("Array Reversal Check: " + res3);
        
        sc.close();
    }
}
