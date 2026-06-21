package Strings.level2;

import java.util.Scanner;

public class ShortestLongestString {
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

    public static int[] findShortestLongest(String[][] data) {
        if (data.length == 0) return new int[]{-1, -1};
        int shortestIdx = 0;
        int longestIdx = 0;
        int minLen = Integer.parseInt(data[0][1]);
        int maxLen = Integer.parseInt(data[0][1]);
        
        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < minLen) {
                minLen = len;
                shortestIdx = i;
            }
            if (len > maxLen) {
                maxLen = len;
                longestIdx = i;
            }
        }
        return new int[]{shortestIdx, longestIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] words = customSplit(text);
        String[][] data = getWordsWithLengths(words);
        int[] indices = findShortestLongest(data);
        
        if (indices[0] != -1) {
            System.out.println("Shortest word: " + data[indices[0]][0] + " (Length: " + data[indices[0]][1] + ")");
            System.out.println("Longest word: " + data[indices[1]][0] + " (Length: " + data[indices[1]][1] + ")");
        }
        
        sc.close();
    }
}
