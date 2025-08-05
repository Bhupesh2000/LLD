package DesignPatterns.BehavioralDesignPatterns.StrategyPattern;

interface PaymentStrategy{
    void processPayment();
}

// Concrete Class: DebitCard
class DebitCard implements PaymentStrategy{
    @Override
    public void processPayment(){
        System.out.println("Payment process via Debit Card");
    }
}

// Concrete Class: CreditCard
class CreditCard implements PaymentStrategy{
    @Override
    public void processPayment(){
        System.out.println("Payment process via Credit Card");
    }
}

class PaymentService{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStartegy(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }

    public void pay(String method){
        paymentStrategy.processPayment(); // Polymorphic behaviour because we don't know which method it's going to call
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        // Make payment via credit card
        paymentService.setPaymentStartegy(new CreditCard());
        paymentService.pay(null);

        // Make payment via debit card
        paymentService.setPaymentStartegy(new DebitCard());
        paymentService.pay(null);
    }
}


// Solution to the problem - 
// With the strategy pattern, the logic for each payment will be encapsulated in a separate strategy class, 
// and the PaymentService will delegate the task of payment processing to one of these strategies at runtime.

// There is will be PaymentService class, which will have a private field strategy and a public method pay()
// This strategy will refer to one of the strategies. So we need to generalize the strategy. 
// So there will be an interface called as payment strategy/ method
// This payment strategy will have one public method that is makePayment() or processPayment()
// Now there will be multiple implementations like CreditCard, UPI or DebitCard etc. 
// These implmentations will implement processPayment() method