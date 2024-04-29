package com.example.acko.rest;

import com.example.acko.entity.Event;
import com.example.acko.request.CreatePaymentRequest;
import com.example.acko.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    public PaymentService paymentService;

    @PostMapping("/initiatePayment")
    public ResponseEntity<Object> initiateEventPayment(@RequestBody Event event){
        return ResponseEntity.ok(paymentService.initiateEventPayemnt(event));
    }

    @PostMapping("/confirmPayment")
    public ResponseEntity<String> confirmEventPayment(@RequestBody CreatePaymentRequest createPaymentRequest){
        return ResponseEntity.ok(paymentService.confirmEventPayement(createPaymentRequest));
    }
}
