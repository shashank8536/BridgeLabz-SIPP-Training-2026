import java.util.Scanner;
import java.util.ArrayList;

public class InsertionSort {

    static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) {
            sc.close();
            return;
        }

        String input = sc.useDelimiter("\\A").next();
        sc.close();

        // Parse integers from input
        input = input.replace("[", " ").replace("]", " ");
        String[] parts = input.split("[,\\s=]+");

        ArrayList<Integer> list = new ArrayList<>();

        for (String part : parts) {

            part = part.trim();

            if (!part.isEmpty() && !part.equalsIgnoreCase("nums")) {

                try {

                    list.add(Integer.parseInt(part));

                } catch (NumberFormatException e) {
                    // Ignore non-integers
                }
            }
        }

        int[] nums = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        insertionSort(nums);

        System.out.print("[");

        for (int i = 0; i < nums.length; i++) {

            System.out.print(nums[i]);

            if (i < nums.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }
}
