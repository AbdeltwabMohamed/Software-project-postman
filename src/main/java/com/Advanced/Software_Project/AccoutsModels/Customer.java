package com.Advanced.Software_Project.AccoutsModels;
import com.Advanced.Software_Project.Services.ServiceData;
import com.Advanced.Software_Project.Services.Services;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.Advanced.Software_Project.AccoutsModels.AccountData.CustomerAccounts;
@Getter
@Component
public class Customer {
    private static int cont=0;
    public UserAccount account;
    public   int ID=CustomerID.ID;
    public ServiceData services;
    public Services service;
    public SignUp signUp;
    public SignIn signin;
    public boolean signed=false;
    public static double  payed;


    public static ArrayList<Double> paymentTransaction = new ArrayList();
    public static ArrayList<String> paymentTransaction1 = new ArrayList();
    public static Map<String,Double> paymentTransactions=new HashMap();

    public Customer() {

    }

    public Customer(int ID) {
        this.ID = ID;
    }

    public UserAccount getAccount() {

        this.account=AccountData.CustomerAccounts.get(this.ID);

        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }



    public void setID(int ID) {
        this.ID = ID;
    }

    public Services getServices() {
        return service;
    }

    public void setServices(Services services) {
        this.service = services;
    }

    public SignUp getSinUp() {
        return signUp;
    }

    public void setSinUp(SignUp signUp) {
        this.signUp = signUp;
    }

    public SignIn getSignin() {
        return signin;
    }

    public void setSignin(SignIn signin) {
        this.signin = signin;
    }

    public boolean isSigned() {
        return signed;
    }

    public void setSigned(boolean signed) {
        this.signed = signed;
    }

    public static double getPayed() {
        return payed;
    }

    public static void setPayed(double payed) {
        Customer.payed = payed;
    }
}
