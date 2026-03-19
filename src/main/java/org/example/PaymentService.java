package org.example;

public class PaymentService {

    public String processPayment() {
        // Hotfix: retry mechanism added
        int retry = 3;
        while (retry-- > 0) {
            try {
                // Refactored logic
                System.out.println("Payment Processing Logs");
                return "Payment Processing v2 - HOTFIX DONE";
            } catch (Exception e) {
                // retry
            }
        }
        return "FAILED";
    }
}