package com.Advanced.Software_Project.PaymentBSL;

import org.springframework.stereotype.Service;

@Service

public class CashBsl extends PaymentBsl{
    public String toString(){
        return "Cash";
    }

    @Override
    public double cost() {
        return this.cost;
    }
}
