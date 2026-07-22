import java.util.Scanner;

public class MovieRatingsSelectionSort {

    static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIdx = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIdx]) {

                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean hasComma = false;
        int n = 0;
        int[] ratings = null;
        int count = 0;

        while (sc.hasNext()) {

            String token = sc.next();

            if (token.contains(",")) {
                hasComma = true;
            }

            String cleaned = token.replaceAll("[^0-9\\-]", "");

            if (!cleaned.isEmpty()) {

                int val = Integer.parseInt(cleaned);

                if (ratings == null) {

                    n = val;
                    ratings = new int[n];

                } else {

                    ratings[count++] = val;

                    if (count == n) {
                        break;
                    }
                }
            }
        }

        if (ratings != null) {

            selectionSort(ratings);

            System.out.print("[");

            for (int i = 0; i < ratings.length; i++) {

                System.out.print(ratings[i]);

                if (i < ratings.length - 1) {

                    if (hasComma) {
                        System.out.print(", ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println("]");
        }

        sc.close();
    }
}
