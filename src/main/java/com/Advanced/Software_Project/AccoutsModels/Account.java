package com.Advanced.Software_Project.AccoutsModels;
import com.Advanced.Software_Project.PaymentBSL.*;
import org.springframework.stereotype.Component;


@Component
public abstract class Account {
    String username;
    String pass;
    String email;

    PaymentBsl payment;



    public static double Wallet=0;

    public static double getWallet() {
        return Wallet;
    }

    public static void setWallet(double wallet) {
        Wallet = wallet;
    }

    public PaymentBsl getPayment() {
        return payment;
    }

    public void setPayment(PaymentBsl payment) {
        this.payment = payment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
