public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; // 150 to 250
        }
        
        System.out.print("Heights of players (in cms): ");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println();
        
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        
        System.out.println("Sum of heights: " + sum + " cms");
        System.out.println("Mean height: " + mean + " cms");
        System.out.println("Shortest height: " + shortest + " cms");
        System.out.println("Tallest height: " + tallest + " cms");
    }
    
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }
    
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }
    
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }
    
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }
}
