package Strings.level1;

import java.util.Scanner;

public class ToUpperCaseDemo {
    public static String manualToUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static boolean compareWithCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String manualUpper = manualToUpperCase(text);
        String builtinUpper = text.toUpperCase();
        
        System.out.println("Manual Upper: " + manualUpper);
        System.out.println("Built-in Upper: " + builtinUpper);
        
        boolean match = compareWithCharAt(manualUpper, builtinUpper);
        System.out.println("Do both match? " + match);
        
        sc.close();
    }
}
