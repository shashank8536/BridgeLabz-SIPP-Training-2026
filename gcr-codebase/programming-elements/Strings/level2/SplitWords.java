package Strings.level2;

import java.util.Scanner;

public class SplitWords {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] customSplit(String text) {
        int len = getLength(text);
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaces++;
        }
        
        String[] words = new String[spaces + 1];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();
        
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                words[wordIndex++] = currentWord.toString();
                currentWord.setLength(0);
            } else {
                currentWord.append(c);
            }
        }
        words[wordIndex] = currentWord.toString();
        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] manualWords = customSplit(text);
        String[] builtInWords = text.split(" ");
        
        boolean match = compareStringArrays(manualWords, builtInWords);
        System.out.println("Do both methods produce the same result? " + match);
        
        sc.close();
    }
}
