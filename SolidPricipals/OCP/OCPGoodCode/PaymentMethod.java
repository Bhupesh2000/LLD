package SolidPricipals.OCP.OCPGoodCode;

public interface PaymentMethod {
    void pay(double amount);
}

// Now the benefit is we can directly add a new class for each new payment method.
// Even SRP will be followed in this case. Lets say we want to change some things lets say charges of one single method
// we don't need to change the whole main class.