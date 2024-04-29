package com.example.acko.service;

import com.example.acko.entity.Event;
import com.example.acko.entity.PaymentStatus;
import com.example.acko.request.CreatePaymentRequest;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Object initiateEventPayemnt(Event event){
        //create merchantID
        //call 3rd party Payment API eg phonePe, razorPay, etc.
        //call "/confirmPayment with payment status"
        return new Object();
    }

    public String confirmEventPayement(CreatePaymentRequest createPaymentRequest){
        if(createPaymentRequest.getPaymentStatus().equals(PaymentStatus.Failed)){
            return "payment is failed";
        }else if(createPaymentRequest.getPaymentStatus().equals(PaymentStatus.Pending)){
            return "payment is pending";
        }else return "payment is done";
    }
}
