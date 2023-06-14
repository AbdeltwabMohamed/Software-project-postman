package com.Advanced.Software_Project.Services.MobileServices;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Service;

@Service
@JsonTypeName("EitsalatMobileRacharge")

public class EitsalatMobileRacharge extends MobileRacharge {
    @Override
    public String toString() {
        return "EitsalatMobileRacharge{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }


}
