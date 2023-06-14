package com.Advanced.Software_Project.PaymentControllers;

import com.Advanced.Software_Project.PaymentBSL.PaymentBsl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    PaymentBsl paymentBsl;

    @GetMapping(value = "/payment")
    public double cost(){
        return paymentBsl.cost();
    }
}
