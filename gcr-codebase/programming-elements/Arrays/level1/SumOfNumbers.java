package Arrays.level1;


import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        
        System.out.println("Enter up to 10 positive numbers (enter 0 or negative to stop):");
        while (true) {
            if (index == 10) {
                break;
            }
            double input = sc.nextDouble();
            if (input <= 0) {
                break;
            }
            numbers[index] = input;
            index++;
        }
        
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println("\nTotal: " + total);
        sc.close();
    }
}
