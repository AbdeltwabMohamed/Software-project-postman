package com.Advanced.Software_Project.Services.InternetPayment;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Service;

@Service
@JsonTypeName("VodafoneInternetPayment")

public class VodafoneInternetPayment extends InternetPayment{

    @Override
    public String toString() {
        return "VodafoneInternetPayment{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}