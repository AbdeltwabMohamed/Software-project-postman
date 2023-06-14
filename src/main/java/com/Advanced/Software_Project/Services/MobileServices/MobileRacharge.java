package com.Advanced.Software_Project.Services.MobileServices;

import com.Advanced.Software_Project.Services.Services;
import org.springframework.stereotype.Service;

@Service
public abstract class MobileRacharge extends Services {
     MobileRacharge(){
          setCost(50);
     }

}
