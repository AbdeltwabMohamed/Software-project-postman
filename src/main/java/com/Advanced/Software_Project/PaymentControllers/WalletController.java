package com.Advanced.Software_Project.PaymentControllers;

import com.Advanced.Software_Project.PaymentBSL.WalletBsl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {
    WalletBsl walletBsl;

    @GetMapping(value = "/wallet")
    public String toString(){
        return walletBsl.toString();
    }
}
