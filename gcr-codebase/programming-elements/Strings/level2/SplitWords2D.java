package Strings.level2;

import java.util.Scanner;

public class SplitWords2D {
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

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] words = customSplit(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        
        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            System.out.printf("%-15s %d\n", wordsWithLengths[i][0], length);
        }
        
        sc.close();
    }
}
