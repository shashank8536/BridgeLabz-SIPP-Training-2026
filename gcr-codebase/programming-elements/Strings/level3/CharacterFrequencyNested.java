package Strings.level3;

import java.util.Scanner;

public class CharacterFrequencyNested {

    public static String[] getFrequencyNested(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[i] != '0') {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        
        int validCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') validCount++;
        }
        
        String[] result = new String[validCount];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        
        String[] freqData = getFrequencyNested(text);
        
        for (int i = 0; i < freqData.length; i++) {
            System.out.println(freqData[i]);
        }
        
        sc.close();
    }
}
