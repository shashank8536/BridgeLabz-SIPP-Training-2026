package Arrays.level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonusAmount = new double[10];
        
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;
        
        int i = 0;
        while (i < 10) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double yos = sc.nextDouble();
            
            if (sal <= 0 || yos < 0) {
                System.out.println("Invalid input. Please enter again.");
                continue;
            }
            salary[i] = sal;
            yearsOfService[i] = yos;
            i++;
        }
        
        for (int j = 0; j < 10; j++) {
            if (yearsOfService[j] > 5) {
                bonusAmount[j] = salary[j] * 0.05;
            } else {
                bonusAmount[j] = salary[j] * 0.02;
            }
            newSalary[j] = salary[j] + bonusAmount[j];
            
            totalBonus += bonusAmount[j];
            totalOldSalary += salary[j];
            totalNewSalary += newSalary[j];
        }
        
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        sc.close();
    }
}
