import java.util.Scanner;

public class UsernameValidator {

    public static boolean isValidUsername(String username, int index) {
        if (index == username.length()) {
            return true;
        }
        char ch = username.charAt(index);
        if (ch < 'a' || ch > 'z') {
            return false;
        }
        return isValidUsername(username, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        boolean result = isValidUsername(username, 0);
        System.out.println("Output: " + result);

        sc.close();
    }
}
