class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankTransactionSystem {
    private static double balance = 5000.0;
    
    public static void main(String[] args) {
        double withdrawalAmount = 6000.0; // Change to test scenarios
        
        try {
            withdraw(withdrawalAmount);
            System.out.println("Withdrawal successful, new balance: " + balance);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
    }
}
