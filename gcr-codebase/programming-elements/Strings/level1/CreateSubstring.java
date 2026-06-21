package Strings.level1;

import java.util.Scanner;

public class CreateSubstring {
    public static String getSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
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
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        
        String manualSub = getSubstring(text, start, end);
        String builtinSub = text.substring(start, end);
        
        System.out.println("Manual Substring: " + manualSub);
        System.out.println("Built-in Substring: " + builtinSub);
        
        boolean match = compareWithCharAt(manualSub, builtinSub);
        System.out.println("Do both substrings match? " + match);
        
        sc.close();
    }
}
