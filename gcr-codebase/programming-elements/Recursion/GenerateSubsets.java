import java.util.ArrayList;
import java.util.Scanner;

public class GenerateSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("\nOutput:");
        generateSubsets(arr, 0, new ArrayList<>());
        sc.close();
    }
    
    public static void generateSubsets(int[] arr, int index, ArrayList<Integer> currentSubset) {
        if (index == arr.length) {
            System.out.print("[");
            for (int i = 0; i < currentSubset.size(); i++) {
                System.out.print(currentSubset.get(i));
                if (i < currentSubset.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
            return;
        }
        
        // Exclude the current element
        generateSubsets(arr, index + 1, currentSubset);
        
        // Include the current element
        currentSubset.add(arr[index]);
        generateSubsets(arr, index + 1, currentSubset);
        
        // Backtrack
        currentSubset.remove(currentSubset.size() - 1);
    }
}
