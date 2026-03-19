package org.example;

public class PaymentService {

    public String processPayment() {
        // Hotfix: retry mechanism added
        int retry = 3;
        while (retry-- > 0) {
            try {
                // Refactored logic
                return "Payment Processing v2 - COMPLETED";
            } catch (Exception e) {
                // retry
            }
        }
        return "FAILED";
    }
}