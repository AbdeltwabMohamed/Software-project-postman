package com.Advanced.Software_Project.PaymentModels;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Payment {
    protected double cost =5000.0;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
