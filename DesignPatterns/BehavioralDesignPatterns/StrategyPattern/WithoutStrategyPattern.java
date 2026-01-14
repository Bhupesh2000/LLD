package DesignPatterns.BehavioralDesignPatterns.StrategyPattern;

class PaymentServiceII{
    public void processPayment(String method){
        if(method.equals("Credit Card")){
            System.out.println("Payment made via credit card");
        }
        else if(method.equals("Debit Card")){
            System.out.println("Payment made via dedit card");
        }
        else{
            throw new IllegalArgumentException("Unsupported payment method");
        }
    }
}

public class WithoutStrategyPattern {
    public static void main(String[] args) {
        PaymentServiceII paymentService = new PaymentServiceII();
        paymentService.processPayment("Credit Card");
        paymentService.processPayment("Debit Card");
    }
}

// In this adding a new payment method lets say UPI can get complicated, based on the checks and algorithms it will use.

// Problems in the above code-
// 1. Payment service class has multiple responsibilities.(deciding payment type and processing it).
// 2. Adding a new method requires modifying the PaymentService class which is violating the open closed principle.
// 3. Using if-else conditions makes the code harder to maintain as more payment methods are added.