import java.util.Scanner;

public class GeneratePermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:\n");
        String str = sc.next();
        
        System.out.println("\nOutput:");
        generatePermutations(str, "");
        sc.close();
    }
    
    public static void generatePermutations(String str, String current) {
        if (str.length() == 0) {
            System.out.println(current);
            return;
        }
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, current + ch);
        }
    }
}
