import java.util.Scanner;

public class ProductPricesBubbleSort {

    static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean hasComma = false;
        boolean spaceInsideBrackets = false;
        int n = 0;
        int[] prices = null;
        int count = 0;

        while (sc.hasNext()) {

            String token = sc.next();

            if (token.equals("[")) {
                spaceInsideBrackets = true;
            }

            if (token.contains(",")) {
                hasComma = true;
            }

            String cleaned = token.replaceAll("[^0-9\\-]", "");

            if (!cleaned.isEmpty()) {

                int val = Integer.parseInt(cleaned);

                if (prices == null) {

                    n = val;
                    prices = new int[n];

                } else {

                    prices[count++] = val;

                    if (count == n) {
                        break;
                    }
                }
            }
        }

        if (prices != null) {

            bubbleSort(prices);

            if (spaceInsideBrackets) {
                System.out.print("[ ");
            } else {
                System.out.print("[");
            }

            for (int i = 0; i < prices.length; i++) {

                System.out.print(prices[i]);

                if (i < prices.length - 1) {

                    if (hasComma) {
                        System.out.print(", ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            if (spaceInsideBrackets) {
                System.out.println(" ]");
            } else {
                System.out.println("]");
            }
        }

        sc.close();
    }
}
