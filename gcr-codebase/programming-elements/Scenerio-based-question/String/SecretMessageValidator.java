import java.util.Scanner;

public class SecretMessageValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the secret code: ");
        String code = sc.nextLine();
        
        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;
        
        String lowerCode = code.toLowerCase();
        
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            char lowerCh = lowerCode.charAt(i);
            
            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!Character.isWhitespace(ch)) {
                specialChars++;
            }
        }
        
        System.out.println("\n--- Detailed Report ---");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
        System.out.println("Total Length: " + code.length());
        
        boolean isStrong = digits >= 2 && specialChars >= 1 && code.length() >= 8;
        
        if (isStrong) {
            System.out.println("\nSecurity Level: Strong");
        } else {
            System.out.println("\nSecurity Level: Weak");
            System.out.println("Reasons for Weak code (if any):");
            if (digits < 2) System.out.println("- Needs at least 2 digits.");
            if (specialChars < 1) System.out.println("- Needs at least 1 special character.");
            if (code.length() < 8) System.out.println("- Needs a minimum length of 8.");
        }
        sc.close();
    }
}
