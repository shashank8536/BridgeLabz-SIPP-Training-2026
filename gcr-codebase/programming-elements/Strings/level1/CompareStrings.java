package Strings.level1;

import java.util.Scanner;

public class CompareStrings {
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
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();
        
        boolean manualResult = compareWithCharAt(str1, str2);
        boolean builtinResult = str1.equals(str2);
        
        System.out.println("Result using charAt(): " + manualResult);
        System.out.println("Result using equals(): " + builtinResult);
        
        if (manualResult == builtinResult) {
            System.out.println("Both methods produced the same result.");
        } else {
            System.out.println("Methods produced different results.");
        }
        sc.close();
    }
}
