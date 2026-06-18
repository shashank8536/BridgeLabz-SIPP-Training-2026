import java.util.Scanner;
import java.util.Arrays;

public class WordMatchSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first skill keyword: ");
        String word1 = sc.nextLine();
        System.out.print("Enter the second skill keyword: ");
        String word2 = sc.nextLine();
        
        System.out.println("\n--- Analysis Report ---");
        System.out.println("String 1 (Uppercase): " + word1.toUpperCase());
        System.out.println("Length of String 1: " + word1.length());
        
        System.out.println("String 2 (Uppercase): " + word2.toUpperCase());
        System.out.println("Length of String 2: " + word2.length());
        
        boolean areAnagrams = checkAnagrams(word1, word2);
        
        if (areAnagrams) {
            System.out.println("\nResult: The two skill keywords ARE anagrams.");
        } else {
            System.out.println("\nResult: The two skill keywords ARE NOT anagrams.");
        }
        sc.close();
    }
    
    public static boolean checkAnagrams(String str1, String str2) {

        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();
        
        if (s1.length() != s2.length()) {
            return false;
        }
        
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
    }
}
