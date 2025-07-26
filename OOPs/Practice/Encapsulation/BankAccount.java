package OOPs.Practice.Encapsulation;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double openingBalance){
        this.owner = owner;
        this.balance = openingBalance;
    }

    public String getOwner(){
        return this.owner;
    }

    public double getBalance(){
        return this.balance;
    }

    public void withdraw(double amount){
        if(balance < amount){
            System.out.println( "Insufficient Balance");
            return;
        }
        this.balance = this.balance - amount;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
}
