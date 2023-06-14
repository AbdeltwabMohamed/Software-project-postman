package com.Advanced.Software_Project.Services.MobileServices;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Service;

@Service
@JsonTypeName("VodafoneRacharge")

public class VodafoneRacharge extends MobileRacharge {
    @Override
    public String toString() {
        return "VodafoneRacharge{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
