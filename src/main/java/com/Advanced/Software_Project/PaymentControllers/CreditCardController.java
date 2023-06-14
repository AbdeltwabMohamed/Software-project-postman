package com.Advanced.Software_Project.PaymentControllers;

import com.Advanced.Software_Project.PaymentBSL.CreditCardBsl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardController {
    CreditCardBsl creditCardBsl;

    @GetMapping(value = "/credit")
    public String toString(){
        return creditCardBsl.toString();
    }
}
