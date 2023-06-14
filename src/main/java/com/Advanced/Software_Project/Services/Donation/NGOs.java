package com.Advanced.Software_Project.Services.Donation;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Service;

@Service
@JsonTypeName("NGOs")

public class NGOs extends Donations {
    @Override
    public String toString() {
        return "NGOs{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}