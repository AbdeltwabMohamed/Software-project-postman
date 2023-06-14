package com.Advanced.Software_Project.Services.MobileServices;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Service;

@Service
@JsonTypeName("OrangeMobileRacharge")

public class OrangeMobileRacharge extends MobileRacharge {
    @Override
    public String toString() {
        return "OrangeMobileRacharge{}";
    }

    public void addToStore() {
        StoreServices.add(toString());
    }
}
