public class RandomArrayAnalyzer {
    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        System.out.print("Generated random values: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        
        double[] results = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
    
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            // Generates a 4-digit number between 1000 and 9999
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }
    
    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) {
            return new double[]{0, 0, 0};
        }
        
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        
        double average = sum / numbers.length;
        
        return new double[]{average, min, max};
    }
}
