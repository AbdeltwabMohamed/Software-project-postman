package com.Advanced.Software_Project.PaymentModels;

import com.Advanced.Software_Project.PaymentBSL.PaymentBsl;
import com.Advanced.Software_Project.Services.Services;
import org.springframework.stereotype.Component;


@Component
public abstract class Discount extends PaymentBsl {
    PaymentBsl paymentBsl;
    double cost = 0.0;
    Services services;

    public PaymentBsl getPaymentBsl() {
        return paymentBsl;
    }

    public void setPaymentBsl(PaymentBsl paymentBsl) {
        this.paymentBsl = paymentBsl;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }
}
