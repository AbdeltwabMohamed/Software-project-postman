package com.Advanced.Software_Project.Services.InternetPayment;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Service;

@Service
@JsonTypeName("WEInternetPayment")

public class WEInternetPayment extends InternetPayment{
    @Override
    public String toString() {
        return "WEInternetPayment{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}