package org.example.springstore;

public class PayPalPaymentService implements PaymentService{
    @Override
    public void processPayment(Double amount) {

        System.out.println("PayPalPaymentService");
        System.out.println("PayPalPaymentService"+amount);

    }
}
