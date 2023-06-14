package com.Advanced.Software_Project.Services.Landlines;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Service;

@Service
@JsonTypeName("QuarterReceipt")

public class QuarterReceipt extends Landline {
    @Override
    public String toString() {
        return "QuarterReceipt{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
