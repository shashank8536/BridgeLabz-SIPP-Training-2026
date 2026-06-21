package Strings.level3;

import java.util.Scanner;

public class CharacterFrequencyUnique {

    public static char[] getUniqueChars(String text) {
        char[] temp = new char[text.length()];
        int uniqueCount = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }
        
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    public static String[][] getFrequencyWithUnique(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        
        char[] uniqueChars = getUniqueChars(text);
        String[][] result = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        
        String[][] freqData = getFrequencyWithUnique(text);
        
        System.out.println("Char\tFrequency");
        for (int i = 0; i < freqData.length; i++) {
            System.out.println(freqData[i][0] + "\t" + freqData[i][1]);
        }
        
        sc.close();
    }
}
