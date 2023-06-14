package com.Advanced.Software_Project.Services.Donation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@JsonTypeName("CancerHospital")
public class CancerHospital extends Donations {
    String number;
    int amount;
    @JsonCreator

    public CancerHospital() {

    }
    @JsonCreator

    public CancerHospital(String S) {

    }

    @Override
    public String

    toString() {


        System.out.println( "CancerHospital{" +
                "number='" + number + '\'' +
                ", amount=" + amount +
                '}');
        return null;
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}