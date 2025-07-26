package OOPs.Encapsulation.Practice;

public class Main {
    public static void main(String[] args) {
        BankAccount Account1 = new BankAccount("Singla", 100);
        Account1.deposit(200);
        System.out.println(Account1.getOwner() + " has balance of " + Account1.getBalance());
        Account1.withdraw(100);
        System.out.println(Account1.getOwner() + " has balance of " + Account1.getBalance());
        Account1.withdraw(400);
        System.out.println(Account1.getOwner() + " has balance of " + Account1.getBalance());
    }
}
