package com.Advanced.Software_Project.PaymentBSL;

import com.Advanced.Software_Project.PaymentModels.Discount;
import com.Advanced.Software_Project.Services.Services;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
@Service
public class SpecificDiscountBsl extends Discount {
    Long amount;
    Services services;
    public static LinkedList<SpecificDiscountBsl> discounts = new LinkedList<SpecificDiscountBsl>();

    public SpecificDiscountBsl() {
    }

    public SpecificDiscountBsl(Long Value, Services services){
        amount = Value;
        this.services = services;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }


    @Override
    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public static LinkedList<SpecificDiscountBsl> getDiscounts() {
        return discounts;
    }

    public static void setDiscounts(LinkedList<SpecificDiscountBsl> discounts) {
        SpecificDiscountBsl.discounts = discounts;
    }


    @Override
    public double cost() {
        return this.getPaymentBsl().cost() - amount;
    }
}
