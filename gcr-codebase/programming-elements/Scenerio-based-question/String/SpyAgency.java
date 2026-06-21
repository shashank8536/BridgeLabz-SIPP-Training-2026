// A spy agency encodes messages. Reverse a secret message, check if
// it is a palindrome, count vowels/consonants, and verify if two
// intercepts are anagrams. Extend: find the first non-repeating
// character in a surveillance log.


import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

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

    // Reverse a secret message
    public static String reverseMessage(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Check if it is a palindrome
    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // 3. Count vowels and consonants
    public static void countVowelsAndConsonants(String s) {
        int vowels = 0, consonants = 0;
        String lowerCaseStr = s.toLowerCase();
        for (int i = 0; i < lowerCaseStr.length(); i++) {
            char ch = lowerCaseStr.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Verify if two intercepts are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        String clean1 = s1.replaceAll("\\s", "").toLowerCase();
        String clean2 = s2.replaceAll("\\s", "").toLowerCase();

        if (clean1.length() != clean2.length()) {
            return false;
        }

        char[] arr1 = clean1.toCharArray();
        char[] arr2 = clean2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // Find the first non-repeating character
    public static char firstNonRepeatingChar(String s) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char ch : s.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Spy Agency Tool ---");
        
        //. Reverse a secret message
        System.out.print("Enter a secret message to reverse: ");
        String message = sc.nextLine();
        System.out.println("Reversed: " + reverseMessage(message));
        
    //     Check palindrome
        System.out.print("\nEnter a message to check if it's a palindrome: ");
        String palCheck = sc.nextLine();
        System.out.println("Is Palindrome? " + isPalindrome(palCheck));
    
        // 3. Count vowels/consonants
        System.out.print("\nEnter a message to count vowels and consonants: ");
        String countCheck = sc.nextLine();
        countVowelsAndConsonants(countCheck);
        
        // Anagram check
        System.out.print("\nEnter first intercept for anagram check: ");
        String intercept1 = sc.nextLine();
        System.out.print("Enter second intercept for anagram check: ");
        String intercept2 = sc.nextLine();
        System.out.println("Are Anagrams? " + areAnagrams(intercept1, intercept2));
        
        //  First non-repeating character
        System.out.print("\nEnter surveillance log to find first non-repeating char: ");
        String log = sc.nextLine();
        char result = firstNonRepeatingChar(log);
        if (result != '\0') {
            System.out.println("First non-repeating character: '" + result + "'");
        } else {
            System.out.println("No non-repeating character found.");
        }
        
        sc.close();
    }
}
