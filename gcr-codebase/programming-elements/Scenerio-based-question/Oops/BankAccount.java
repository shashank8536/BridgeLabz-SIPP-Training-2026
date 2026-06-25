/*Design a simple BankAccount class that models real-world banking behaviour.Each account shoulld store basic details like 
account  umber, holder name and balance. you will implement method to deposit and withdraw money, ensuring that withdraw ddoesn't 
exceeds the available balance. The class should also keep track of how many account have created using a static version .
Finally, create a multiple accoumt and simulate transaction to observe how the system behaves.

Key Points:-
Create a class with AccountNumber,Holdername and balance
Implement deposit() & withdraaw() with proper balance checks
add getstatement() to display accountdetails
use a static variable to count total accounts created 
create 3 account and perform 5 transactions on each
*/



public class BankAccount {
    int AccountNumber;
    String name;
    int balance;

    String deposit(int money){
        balance+=money;
        return "Your money has been deposited sucessfully";
    }
    String withDraw(int withdraw){
        if(withdraw>balance){
            return "Your withdraw amount is greater than current balance";
        }
        else{
            balance-=withdraw;
            return "You withdrawn the amount";
        }
    }
    public static void main(String[] args) {
        
    }
    
}
