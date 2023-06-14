package com.Advanced.Software_Project.AccoutsController;


import com.Advanced.Software_Project.AccountsBL.AdminBL;
import com.Advanced.Software_Project.AccoutsModels.*;
import com.Advanced.Software_Project.PaymentBSL.OverallDiscountBsl;
import com.Advanced.Software_Project.PaymentBSL.SpecificDiscountBsl;
import com.Advanced.Software_Project.Services.Services;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

@RestController
@Component
public class AdminController {
    AdminBL BL=new AdminBL();
    Admin Admin;


    AdminController(AdminBL bl, Admin Admin){
        BL=bl;
        this.Admin=Admin;
    }


    @GetMapping( value = "/InsertServices")
    public  ResponseEntity<String> insertServices(){
        BL.InsertServices();
        //"successful all services is ready";
        return  ResponseEntity.ok("All Services Created Successfully");
    }
    @PostMapping(value = "/signUp")
    public AdminAccount createAdminAccount(@RequestBody AdminAccountData a){
        return BL.sginup(a);





    }
    @GetMapping(value = "/signIn")
    public ResponseEntity<String> AdminSignIn(@RequestBody  String name){
        boolean check=false;
        for(int i=0;i<AccountData.AdminAccounts.size();i++){
            if(name.contains(AccountData.AdminAccounts.get(i).getUsername()))
                check=true;
        }
        if(check)
            return ResponseEntity.ok("Signed in succssefully");
        else
           return ResponseEntity.ok("User name is error Try again");

    }
    @PostMapping(value = "/createSpecificDis")
    public ResponseEntity<String> createSpecificDis(@RequestBody  Services type,@RequestParam("number") Long number ){
        System.out.println(number);
         BL.createSpecificDis(type,number);
        System.out.println(SpecificDiscountBsl.discounts.get(0).getAmount());

        return ResponseEntity.ok("The specified discount has been created successfully");
    }
    @PostMapping(value = "/createOverallDiscound")
    public String createOverallDiscound(@RequestParam("number") int number){
        BL.createOverallDiscound(number);
        System.out.println(OverallDiscountBsl.getOverallDiscount(number).getDiscountAmount());
        return "The overall discount has been created successfully";
    }


    @GetMapping (value = "/displayRefunds")
    public LinkedList<UserAccount> displayRefunds() {

         //BL.DisplayRefund();
        return BL.DisplayRefund();
    }
    @GetMapping(value = "/accept")
    public String accepted(@RequestParam("id") int id){

          return BL.accepted( id);

    }
    @GetMapping (value = "/PaymentTransaction")
    public Map<String,Double> PaymentTransaction() {

        return BL.PaymentTransaction();
    }
    @GetMapping (value = "/AddtoWalletTransaction")
    public LinkedList<Services> Addtowallet() {

        return AccountData.Addtowallet;
    }

}
