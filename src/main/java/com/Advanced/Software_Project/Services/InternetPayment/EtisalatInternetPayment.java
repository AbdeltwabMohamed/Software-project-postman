package com.Advanced.Software_Project.Services.InternetPayment;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Service;


@Service
@JsonTypeName("EtisalatInternetPayment")

public class EtisalatInternetPayment extends InternetPayment{
    @Override
    public String toString() {
        return "EtisalatInternetPayment{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}