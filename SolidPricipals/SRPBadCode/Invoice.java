package SolidPricipals.SRPBadCode;

public class Invoice {
    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("Invoice generated for invoice of amount " + this.amount);
    }

    public void saveToDB(){
        System.out.println("Invoice saved to db");
    }

    public void sendEmailNotification(){
        System.out.println("Sending email notification");
    }
}


// Both saveToDB() and sendEmailNotification() are bad codes. these are not invoice specific methods.
// Any change to these methods in the future will require change in Invoice class as well which is not good. 