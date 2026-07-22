import java.util.Scanner;
import java.util.ArrayList;

public class BubbleSortSwapCount {

    static int bubbleSortAndCountSwaps(int[] arr) {

        int n = arr.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapCount++;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }

        return swapCount;
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

        int swaps = bubbleSortAndCountSwaps(nums);

        System.out.println(swaps);
    }
}
