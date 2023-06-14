package com.Advanced.Software_Project.AccoutsModels;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;
@Component
public class SignUp {
    String usrName;
    static AccountData accountData =new AccountData();
    String pass;
    String email;
    Account account;
    UserAccountData g;
    public SignUp() {
    }

    public SignUp(String usrName, String pass,String email) {
        boolean flag=true;
        for (Map.Entry<String, String> me : accountData.users.entrySet()) {
            if (me.getKey() == usrName) {
                System.out.println("error to the user this account already exist" +
                        "");
                flag=false;
                break;
            }
        }

        if(flag==true){
            this.usrName = usrName;
            this.pass = pass;
            this.email = email;
             account = new UserAccount( g);

            accountData.users.put(g.name, g.pass);

        }

    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
