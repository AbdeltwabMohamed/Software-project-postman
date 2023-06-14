package com.Advanced.Software_Project.PaymentBSL;

import org.springframework.stereotype.Service;

@Service
public class WalletBsl extends PaymentBsl{
    public String toString(){
        return "Wallet";
    }
    @Override
    public double cost() {
        return this.cost;
    }
}
