
public class Bank {

    private double amount;
    // Constructor to initialize the account
    Bank(double amount){
        this.amount = amount;
    }
    // Method to withdraw money from the account.
    public void withdraw(double withdrawalAmount){
        String msg = (withdrawalAmount <= amount) ? "withdraw successful" : "Insufficient amount can't withdraw";

        if(withdrawalAmount <= amount){
            amount = amount-withdrawalAmount;
        }

        System.out.println(msg);
    }
    public void deposit(double depositAmount){
        amount = amount + depositAmount;
        System.out.println("Total Balance :" + amount);
    }

    public  static void main(String[] args){
        Bank bankobj = new Bank(10000);
        bankobj.withdraw(6000);
        bankobj.deposit(5000);
    }
}