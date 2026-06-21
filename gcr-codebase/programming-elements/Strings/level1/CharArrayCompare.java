package Strings.level1;

import java.util.Scanner;

public class CharArrayCompare {
    public static char[] getCharacters(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        
        char[] manualChars = getCharacters(text);
        char[] builtinChars = text.toCharArray();
        
        boolean match = compareArrays(manualChars, builtinChars);
        System.out.println("Do both character arrays match? " + match);
        
        sc.close();
    }
}
