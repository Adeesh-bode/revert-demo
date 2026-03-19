package org.example;

public class PaymentService {

    public String processPayment() {
        // Hotfix: retry mechanism added
        int retry = 3;
        while (retry-- > 0) {
            try {
                return "Payment Processing v1 - SUCCESS";
            } catch (Exception e) {
                // retry
            }
        }
        return "FAILED";
    }
}