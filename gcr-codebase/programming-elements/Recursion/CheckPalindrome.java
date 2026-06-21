import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:\n");
        String str = sc.next();
        
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("\nOutput:\nPalindrome");
        } else {
            System.out.println("\nOutput:\nNot a Palindrome");
        }
        sc.close();
    }
    
    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, left + 1, right - 1);
    }
}
