package SolidPricipals.OCP.OCPGoodCode;

public class CreditCard implements PaymentMethod{
    public void pay(double amount){
        // business login
        System.out.println("Payment of " + amount + " made via credit card");
    }
}
