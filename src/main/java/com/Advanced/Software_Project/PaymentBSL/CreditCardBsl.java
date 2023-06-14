package com.Advanced.Software_Project.PaymentBSL;

import org.springframework.stereotype.Service;

@Service
public class CreditCardBsl extends PaymentBsl{
    public String toString(){
        return "CreditCard";
    }
    @Override
    public double cost() {
        return this.cost;
    }
}
