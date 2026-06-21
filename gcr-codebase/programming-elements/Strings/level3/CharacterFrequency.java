package Strings.level3;

import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] getFrequency(String text) {
        int[] freq = new int[256];
        
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) uniqueCount++;
        }
        
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                result[index][0] = String.valueOf(text.charAt(i));
                result[index][1] = String.valueOf(freq[text.charAt(i)]);
                freq[text.charAt(i)] = 0; 
                index++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        
        String[][] freqData = getFrequency(text);
        
        System.out.println("Char\tFrequency");
        for (int i = 0; i < freqData.length; i++) {
            System.out.println(freqData[i][0] + "\t" + freqData[i][1]);
        }
        
        sc.close();
    }
}
