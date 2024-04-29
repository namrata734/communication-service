package com.example.acko.request;

import com.example.acko.entity.PaymentStatus;
import lombok.Data;

@Data
public class CreatePaymentRequest {
    String eventName;
    PaymentStatus paymentStatus;
}
