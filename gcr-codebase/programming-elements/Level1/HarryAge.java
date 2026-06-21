package Level1;

import java.util.Scanner;

public class HarryAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int birthYear = 2000;
        int currYear = 2024;

        int Age = currYear-birthYear;
        System.out.println("Harry's age in 2024 is " + Age);
    }
}
