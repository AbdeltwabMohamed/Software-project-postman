package com.Advanced.Software_Project.Services.Donation;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Service;

@Service
@JsonTypeName("Schools")

public class Schools extends Donations {
    @Override
    public String toString() {
        return "Schools{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}