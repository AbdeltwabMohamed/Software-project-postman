package com.Advanced.Software_Project.AccountsBL;
import com.Advanced.Software_Project.AccoutsModels.*;
import com.Advanced.Software_Project.Services.ServiceData;
import com.Advanced.Software_Project.Services.Services;
import com.Advanced.Software_Project.PaymentBSL.*;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Vector;

@Service
public class CustomerBL {
    Customer customer=new Customer();
    public void update(){
        System.out.println("your refund is accept");
    }


    public void addRefund(Customer customer){

        AdminBL.refund(customer);

    }
    public Vector<String> search(String name){
        if(name.equals("landline")){
            return AccountData.landline;

        } else if(name.equals("mobile")){
            return AccountData.mobile;

        }else  if(name.equals("donation")){
            return AccountData.donation;

        }else  if(name.equals("InternetPayment")){
            return AccountData.InternetPayment;

        }

        return null;
    }
    public UserAccount sginup(UserAccountData a){
        return new UserAccount(a);
    }
    public String signin(String username){
        boolean check=false;
        for(int i=0;i<AccountData.CustomerAccounts.size();i++){
            if(username.equals(AccountData.CustomerAccounts.get(i).getUsername()))
                check=true;
        }
        if(check)
            return "Signed in successfully";
        else
            return "User name or Password is error Try again";
    }
    public void refund(AdminBL admin,Services service){


        admin.Subscrib(customer,service);



    }
    public double pay(Services services,int id ,String s){

        //if(customer.signed==true) {
        Customer customer=new Customer(id);

        //customer.services.servicesName = services.servicesName;
           // customer.services.Cost = services.Cost;


            System.out.println("Enter payment method");

            if(s.equals("wallet")){
                System.out.println("You now pay using wallet");
                customer.getAccount().setPayment(new WalletBsl());}
            else if(s.equals("cache")){
                System.out.println("You now pay using Cache");

                customer.getAccount().setPayment(new CashBsl());}

            else if(s.equals("CreditCard")){
                System.out.println("You now pay using CreditCard");
                customer.getAccount().setPayment(new CreditCardBsl());}
            else
            System.out.println("You entered wrong payment method ");


            customer.getAccount().getPayment().setCost(services.Cost);

            System.out.println(customer.getAccount().getPayment().getCost());
            PaymentBsl payment = customer.getAccount().getPayment();

            System.out.println(services.toString());

            for (int i = 0; i < SpecificDiscountBsl.discounts.size(); i++) {


                if (services.toString().equals(SpecificDiscountBsl.discounts.get(i).getServices().toString())) {
                    SpecificDiscountBsl.discounts.get(i).setPaymentBsl(payment);
                    payment =SpecificDiscountBsl.discounts.get(i);
                    System.out.println(payment.cost());

                } else
                    System.out.println("This discound not for this services ");
            }
            if(Admin.Overall) {
                Admin.discound.setPaymentBsl(payment);
                payment=Admin.discound;
                System.out.println("OverAll :"+payment.cost());
            }
            if(s.equals("wallet")) {
                if (customer.account.Wallet > payment.cost())
                    customer.account.Wallet = customer.account.Wallet - payment.cost();
                else {
                    System.out.println("u dont have enoght money");
                }
            }
            customer.payed=payment.cost();
            Customer.paymentTransaction.add(customer.payed);
            Customer.paymentTransaction1.add(services.toString());
            Customer.paymentTransactions.put(services.toString(),customer.payed);
            return payment.cost();

    }
    public void addtowallet(Services service){
        AccountData.Addtowallet.add(service);
    }
}
