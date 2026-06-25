// ATM Withdrawal System
// Scenario: Account balance = ₹5,000, Withdrawal request = ₹8,000
// Question: Create a custom exception called InsufficientBalanceException.
// What information should the exception contain, and where should it be handled?

class InsufficientBalanceException extends Exception {
    private double currentBalance;
    private double requestedAmount;

    public InsufficientBalanceException(String message, double currentBalance, double requestedAmount) {
        super(message);
        this.currentBalance = currentBalance;
        this.requestedAmount = requestedAmount;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}

public class ATMWithdrawalSystem {
    public static void main(String[] args) {
        double accountBalance = 5000;
        double withdrawalRequest = 8000;

        try {
            withdraw(accountBalance, withdrawalRequest);
            System.out.println("Withdrawal successful.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed!");
            System.out.println("Error Message: " + e.getMessage());
            System.out.println("Current Balance: ₹" + e.getCurrentBalance());
            System.out.println("Requested Amount: ₹" + e.getRequestedAmount());
        }
    }

    public static void withdraw(double balance, double request) throws InsufficientBalanceException {
        if (request > balance) {
            throw new InsufficientBalanceException("Insufficient funds to process the withdrawal.", balance, request);
        }
        balance -= request;
    }
}
