public class ExceptionPropagationThrows {
    public static void main(String[] args) {
        double amount = -1000;
        double rate = 5;
        int years = 2;
        
        try {
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return (amount * rate * years) / 100;
    }
}
