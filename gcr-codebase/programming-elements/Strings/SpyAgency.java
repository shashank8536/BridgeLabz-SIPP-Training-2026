
// A spy agency encodes messages. Reverse a secret message, check if
// it is a palindrome, count vowels/consonants, and verify if two
// intercepts are anagrams. Extend: find the first non-repeating
// character in a surveillance log.
package Strings;

import java.util.Scanner;

public class SpyAgency {
    public static String ReverseWords(String s) {
        String[] words = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Hello,I am Shashank shekhar";

    }
}
