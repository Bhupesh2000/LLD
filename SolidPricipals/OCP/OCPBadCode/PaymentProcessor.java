package SolidPricipals.OCP.OCPBadCode;

// A payment application which will support different payment options
public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount){
        if(paymentMethod == "CreditCard"){
            // business logic
            System.out.println("Payment of " + amount + " processed via Credit Card");
        }
        else if(paymentMethod == "DebitCard"){
            // business logic
            System.out.println("Payment of " + amount + " processed via Debit Card");
        }
        else if(paymentMethod == "Paypal"){
            // business logic
            System.out.println("Payment of " + amount + " processed via Paypal");
        }
        else{
            throw new IllegalArgumentException("Unsupported payment method");
        }
    }
}

// Problem with above code - 
// If in future we want to add a new payment method like UPI, we will need to modify the processPayment
// This breaks open/close principle