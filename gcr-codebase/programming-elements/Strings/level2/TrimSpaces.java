package Strings.level2;

import java.util.Scanner;

public class TrimSpaces {
    public static int[] getTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }

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
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();
        
        int[] indices = getTrimIndices(text);
        String manualTrim = getSubstring(text, indices[0], indices[1]);
        String builtInTrim = text.trim();
        
        System.out.println("Manual Trim: '" + manualTrim + "'");
        System.out.println("Built-in Trim: '" + builtInTrim + "'");
        
        boolean match = compareWithCharAt(manualTrim, builtInTrim);
        System.out.println("Do both trimmed strings match? " + match);
        
        sc.close();
    }
}
