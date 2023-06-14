package com.Advanced.Software_Project.Services.InternetPayment;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Service;

@Service
@JsonTypeName("OrangeInternetPayment")

public class OrangeInternetPayment extends InternetPayment{
    @Override
    public String
    toString() {
        return "OrangeInternetPayment{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}