package com.Advanced.Software_Project.Services.Landlines;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Service;

@Service
@JsonTypeName("MonthlyReceipt")

public class MonthlyReceipt extends Landline {
    @Override
    public String toString() {
        return "MonthlyReceipt{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
