// q - Ravi just join college guild. Store his name,age,rank,salary & membership fee(float) using correct data type.compute his annual bonus(12% of salary), cast it to int, print it to formatted welcome card.


import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        int rank = sc.nextInt();
        int salary = sc.nextInt();
        float membership_fee = sc.nextFloat();

        double bonus = salary * 0.12;
        int annual_bonus = (int) bonus;

        System.out.println("============/Welcome card=============/");
        System.out.println("name: "+ name);
        System.out.println("age:" + age);
        System.out.println("Rank:" + rank);
        System.out.println("Salary:" + salary);
        System.out.println("Membership Fee:"+ membership_fee);
        System.out.println("Annual_bonus:"+ annual_bonus);
    }
    
}
