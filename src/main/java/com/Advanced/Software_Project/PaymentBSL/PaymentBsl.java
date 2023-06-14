package com.Advanced.Software_Project.PaymentBSL;

//import com.Phase2.Payment_Discount.Entity.Payment;
import com.Advanced.Software_Project.PaymentModels.Payment;
import org.springframework.stereotype.Service;

@Service
public abstract class PaymentBsl extends Payment {
    Payment payment;
    public abstract double cost();
}
