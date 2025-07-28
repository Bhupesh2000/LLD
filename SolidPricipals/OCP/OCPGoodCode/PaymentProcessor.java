package SolidPricipals.OCP.OCPGoodCode;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount); // Runtime polymorphism
    }
}
