package com.Advanced.Software_Project.Services.MobileServices;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Service;

@Service
@JsonTypeName("WEReachage")

public class WEReachage extends MobileRacharge {
    @Override
    public String toString() {
        return "WEReachage{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
