package com.phfuark.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE");
        System.out.printf("Amount: %f", amount);
    }
}
