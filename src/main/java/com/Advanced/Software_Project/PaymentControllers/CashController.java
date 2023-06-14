package com.Advanced.Software_Project.PaymentControllers;

import com.Advanced.Software_Project.PaymentBSL.CashBsl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CashController {
    CashBsl cashBsl;

    @GetMapping(value = "/cash")
    public String toString(){
        return cashBsl.toString();
    }
}
