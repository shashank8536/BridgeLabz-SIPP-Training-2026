package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String result = "";
        for(int i=s.length()-1;i>=0;i--){
            result+=s.charAt(i);
        }
        if(s.equals(result)){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        sc.close();

    }
}
