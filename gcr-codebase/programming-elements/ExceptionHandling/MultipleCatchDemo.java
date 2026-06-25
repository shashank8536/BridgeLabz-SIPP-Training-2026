import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        
        try {
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } finally {
            sc.close();
        }
    }
}
