package SolidPricipals.SRPGoodCode;

public class Invoice {
    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("Invoice generated for invoice of amount " + this.amount);
    }
}