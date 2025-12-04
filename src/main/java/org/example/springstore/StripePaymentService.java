package org.example.springstore;

public class StripePaymentService implements PaymentService {
   public void  processPayment(Double amount) {

           System.out.println("Stripe payment");
           System.out.println("Processing payment"+amount) ;


   }
}
