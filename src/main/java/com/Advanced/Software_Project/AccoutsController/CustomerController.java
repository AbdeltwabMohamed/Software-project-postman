package com.Advanced.Software_Project.AccoutsController;


import com.Advanced.Software_Project.AccountsBL.CustomerBL;
import com.Advanced.Software_Project.AccoutsModels.AccountData;
import com.Advanced.Software_Project.AccoutsModels.Customer;
import com.Advanced.Software_Project.AccoutsModels.UserAccountData;
import com.Advanced.Software_Project.Services.ServiceData;
import com.Advanced.Software_Project.Services.Services;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Vector;

@RestController
public class CustomerController {
    CustomerBL BL;
    Customer customer;
    CustomerController(CustomerBL bl,Customer customer){
        BL=bl;
        this.customer=customer;
    }
    @PostMapping(value = "/CustomerSignUp")
    public ResponseEntity<String> createCustomerAccount(@RequestBody UserAccountData a){
        boolean check=true;
        for(int i=0;i<AccountData.CustomerAccounts.size();i++){
            if(a.name.equals(AccountData.CustomerAccounts.get(i).getUsername()))
                check=false;
        }
        if(check)
            return ResponseEntity.ok(BL.sginup(a).toString());
        else
            return ResponseEntity.ok("User name is error Try again");
    }

    @GetMapping(value = "/CustomerSignIn")
    public ResponseEntity<String> CustomerAccount(@RequestParam("name") String name){
            return ResponseEntity.ok(BL.signin(name));
    }

    @GetMapping(value = "/search")
    public Vector<String> search(@RequestParam("name")String name){
        return BL.search( name);
        //return //"This is search results";
    }

    @PostMapping(value = "/addrefund")
    public ResponseEntity<String> addrefund(@RequestBody Customer customer) {
        BL.addRefund(customer);
        boolean check=true;
        for(int i=0;i<AccountData.CustomerAccounts.size();i++){
            if(customer.ID == AccountData.CustomerAccounts.get(i).ID)
                check=false;
        }
        if(check)
            return ResponseEntity.ok("ID is error Try again");
        else
            BL.addRefund(customer);
            return ResponseEntity.ok("The refund  has been added successfully");
    }

    @PostMapping (value = "/pay")
    public ResponseEntity<Double> paying(@RequestParam("PaymentMethod") String s,@RequestParam("ID") int id,@RequestBody Services services){

        boolean check=false;
        for(int i=0;i<AccountData.CustomerAccounts.size();i++){
            if(id == AccountData.CustomerAccounts.get(i).ID)
                check=true;
        }
        if(!check)
            return  ResponseEntity.ok(0.0);
        else
        return ResponseEntity.ok(BL.pay(services,id,s));
        //return ResponseEntity.ok(BL.pay(services,id,s));
    }
    @PostMapping(value = "/AddTowallet")
    public ResponseEntity<String> AddtoWallet(@RequestBody Services services, @RequestParam("id") int id) {
        BL.addtowallet(services);
        boolean check=true;
        for(int i=0;i<AccountData.CustomerAccounts.size();i++){
            if(id == AccountData.CustomerAccounts.get(i).ID)
                check=false;
        }
        if(check)
            return ResponseEntity.ok("ID is error Try again");
        else
            BL.addtowallet(services);
        return ResponseEntity.ok("Add to wallet successfully");
    }
}
