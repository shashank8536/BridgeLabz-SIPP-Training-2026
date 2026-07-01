class Account {

    private String accountNumber;
    private String holderName;
    private double balance;

    static int totalAccounts = 0;

    public Account(String accountNumber,
            String holderName,
            double balance) {

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited in " + accountNumber);
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn from " + accountNumber);
        } else {
            System.out.println("Overdraft not allowed in "
                    + accountNumber);
        }
    }

    public void getStatement() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        Account acc1 = new Account("ACC101", "Palak", 10000);

        Account acc2 = new Account("ACC102", "Riya", 15000);

        Account acc3 = new Account("ACC103", "Aman", 20000);

        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.deposit(700);
        acc1.withdraw(300);
        acc1.deposit(1200);

        acc2.deposit(2000);
        acc2.withdraw(1000);
        acc2.deposit(500);
        acc2.withdraw(700);
        acc2.deposit(1000);

        acc3.deposit(3000);
        acc3.withdraw(4000);
        acc3.deposit(500);
        acc3.withdraw(1000);
        acc3.deposit(1500);

        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        System.out.println("\nTotal Accounts Created = "
                + Account.totalAccounts);
    }
}