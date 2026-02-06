package com.codingshuttle.youtube.internalWorkingOfSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "razorpay")
public class RazorpayPaymentService implements PaymentService {

    @Override  // it tells java that this method is coming from other file
    public String pay() {
        String payment = "Razorpay Payment";
        System.out.println("Payment from: "+payment);
        return payment;
    }

}
