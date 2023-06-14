package com.Advanced.Software_Project.Services.InternetPayment;

import com.Advanced.Software_Project.Services.Services;
import org.springframework.stereotype.Service;

@Service
public abstract class InternetPayment extends Services {
    InternetPayment(){
        Cost=60;
    }
}