package com.Advanced.Software_Project.Services;

import com.Advanced.Software_Project.Services.Donation.CancerHospital;
import com.Advanced.Software_Project.Services.Donation.NGOs;
import com.Advanced.Software_Project.Services.InternetPayment.EtisalatInternetPayment;
import com.Advanced.Software_Project.Services.InternetPayment.OrangeInternetPayment;
import com.Advanced.Software_Project.Services.InternetPayment.VodafoneInternetPayment;
import com.Advanced.Software_Project.Services.InternetPayment.WEInternetPayment;
import com.Advanced.Software_Project.Services.Landlines.MonthlyReceipt;
import com.Advanced.Software_Project.Services.Landlines.QuarterReceipt;
import com.Advanced.Software_Project.Services.MobileServices.EitsalatMobileRacharge;
import com.Advanced.Software_Project.Services.MobileServices.OrangeMobileRacharge;
import com.Advanced.Software_Project.Services.MobileServices.VodafoneRacharge;
import com.Advanced.Software_Project.Services.MobileServices.WEReachage;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CancerHospital.class, name = "CancerHospital"),
        @JsonSubTypes.Type(value = WEReachage.class, name = "WEReachage"),
        @JsonSubTypes.Type(value = VodafoneRacharge.class, name = "VodafoneRacharge"),
        @JsonSubTypes.Type(value = OrangeMobileRacharge.class, name = "OrangeMobileRacharge"),
        @JsonSubTypes.Type(value = EitsalatMobileRacharge.class, name = "EitsalatMobileRacharge"),
        @JsonSubTypes.Type(value = MonthlyReceipt.class, name = "MonthlyReceipt"),
        @JsonSubTypes.Type(value = QuarterReceipt.class, name = "QuarterReceipt"),
        @JsonSubTypes.Type(value = EtisalatInternetPayment.class, name = "EtisalatInternetPayment"),
        @JsonSubTypes.Type(value = OrangeInternetPayment.class, name = "OrangeInternetPayment"),
        @JsonSubTypes.Type(value = VodafoneInternetPayment.class, name = "VodafoneInternetPayment"),
        @JsonSubTypes.Type(value = WEInternetPayment.class, name = "WEInternetPayment"),
        @JsonSubTypes.Type(value = NGOs.class, name = "NGOs"),


})
public abstract class Services {

    //    String NameServices;
////    MobileRacharge mobileRacharge;
////    InternetPayment internetPayment;
////    Landline landline;
////    Donations donations;
//    ArrayList<Services> list=new ArrayList<Services>();
//    String company;
//
    public ArrayList<String> StoreServices=new ArrayList();
    abstract public void addToStore();

//    public Services(){};
    public double Cost=500;

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }
}
