package com.Advanced.Software_Project.Services.Landlines;

import com.Advanced.Software_Project.Services.Services;
import org.springframework.stereotype.Service;

@Service
public abstract class Landline extends Services {
    Landline(){
        Cost=70;
    }
}
