package com.Advanced.Software_Project.AccoutsModels;
import com.Advanced.Software_Project.PaymentBSL.PaymentBsl;
import org.springframework.stereotype.Component;

@Component
public class UserAccount extends Account{
    public  int ID=0;

    private PaymentBsl payment;
    public UserAccount(UserAccountData a){
        super.username=a.name;
        super.pass=a.pass;
        ID=CustomerID.ID++;
        super.email=a.email;
        payment =a.payment;
        AccountData.CustomerAccounts.add(this);
    }

    public UserAccount() {
    }

    public PaymentBsl getPayment() {
        return payment;
    }

    public void setPayment(PaymentBsl payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "UserAccount{" +"\r\n"+
                "ID='"+ID + "\r\n" +
                ", username='" + username + "\r\n" +
                ", pass='" + pass + "\r\n" +
                ", email='" + email + "\r\n" +
                '}';
    }

//    public  int getID() {
//        return ID;
//    }

    public void setID(int ID) {
        this.ID = ID;
    }


}
