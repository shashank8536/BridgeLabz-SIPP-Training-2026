package Strings.level1;

import java.util.Scanner;

public class ToLowerCaseDemo {
    public static String manualToLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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
        
        String manualLower = manualToLowerCase(text);
        String builtinLower = text.toLowerCase();
        
        System.out.println("Manual Lower: " + manualLower);
        System.out.println("Built-in Lower: " + builtinLower);
        
        boolean match = compareWithCharAt(manualLower, builtinLower);
        System.out.println("Do both match? " + match);
        
        sc.close();
    }
}
