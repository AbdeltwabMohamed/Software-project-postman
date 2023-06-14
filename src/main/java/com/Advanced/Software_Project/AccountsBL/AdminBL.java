package com.Advanced.Software_Project.AccountsBL;

import com.Advanced.Software_Project.AccoutsModels.*;
import com.Advanced.Software_Project.PaymentBSL.OverallDiscountBsl;
import com.Advanced.Software_Project.PaymentBSL.SpecificDiscountBsl;
import com.Advanced.Software_Project.PaymentModels.Discount;
import com.Advanced.Software_Project.Services.Services;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

@Service

public class AdminBL {
    static int cont=0;
     static Admin admin;
    static Customer customer;
    static Discount discound;
     public static LinkedList<UserAccount> dd =new LinkedList<UserAccount>();


    public AdminBL() {
    }

    public static void InsertServices(){
        AccountData.donation.add("CancerHospital");
        AccountData.donation.add("NGOs");
        AccountData.donation.add("schools");
        AccountData.landline.add("monthly");
        AccountData.landline.add("QuarterReceipt");
        AccountData.mobile.add("Orange");
        AccountData.mobile.add("Vodafone");
        AccountData.mobile.add("Etisalat");
        AccountData.mobile.add("WE");
        AccountData.InternetPayment.add("Orange");
        AccountData.InternetPayment.add("Vodafone");
        AccountData.InternetPayment.add("We");
        AccountData.InternetPayment.add("Etisalat");
    }


    public void createSpecificDis(Services services,Long number){

        SpecificDiscountBsl.getDiscounts().add(new SpecificDiscountBsl(number,services));


    }

    public Discount createOverallDiscound(double discoundValue) {
        discound= OverallDiscountBsl.getOverallDiscount(discoundValue);
        admin.Overall=true;
        return discound;
    }

    public static void refund(Customer customer) {
        Admin.list.add(customer);
    }

    public LinkedList<UserAccount> DisplayRefund() {

            LinkedList<UserAccount> d = new LinkedList<UserAccount>();
            AdminBL.dd.clear();


            for (int i = 0; i < Admin.list.size(); i++) {

                d.add(Admin.list.get(i).getAccount());
            }
            for (int i = 0; i < d.size(); i++) {
                if (i >= 1)
                    if (d.get(i) == d.get(i - 1))
                        continue;
                AdminBL.dd.add(d.get(i));

            }


            return AdminBL.dd;



    }
    public String accepted(int id) {


            boolean flag=false;
            for (int i=0;i<Admin.list.size();i++) {
                if (id == (Admin.list.get(i).getID())){
                    this.Notify(id);
                    Admin.list.get(i).getAccount().Wallet+=Admin.list.get(i).payed;

                    Admin.list.remove(id);
                    for(int g=0;g<AdminBL.dd.size();g++){
                        if(AdminBL.dd.get(g).ID==id)
                            AdminBL.dd.remove(g);
                    }


                    flag=true;

                }


            }
            if(flag==false)
                return "this inedex not exist";
            else
                return "refund Accepted";
    }
    public String Notify(int x){
        boolean flag=false;
        for (Map.Entry<Customer,Services> me:Admin.refunds.entrySet()){
            System.out.println(me.getKey().getID());
            if(me.getKey().getID()==x){
                flag=true;
                return "refund accepted";

            }


        }
        if(flag==false){
            System.out.println("this refund not exist");
        }
        return "this refund not exist";

    }
    public void Subscrib(Customer customer,Services service){
        Admin.refunds.put(customer,service);
        Admin.list.add(customer);
    }
    public void UnSubscrib(Customer customer){
        if( Admin.refunds.containsKey(customer))
            Admin.refunds.remove(customer);
        else
            System.out.println("No Customer");
    }


    public Map<String,Double> PaymentTransaction()
    {
        for (int i=0;i<Customer.paymentTransactions.size();i++) {
            return  Customer.paymentTransactions;
            }
        return  Customer.paymentTransactions;
    }

    public void refundTransaction()
    {
        for (Customer customer1 : admin.list) {

            customer1.account.toString();
        }
    }
    public AdminAccount sginup(AdminAccountData a){
        return new AdminAccount(a);


    }
    public void signin(String username){
        admin.signin=new SignIn(username);
        if(admin.signin.isConditions()) {
            System.out.println("sign in successfully");
            admin.signed = true;
        }
        else
            admin.signed=false;


    }

}
