package com.Advanced.Software_Project.AccoutsModels;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.lang.String;

@Component
public class SignIn {
String usrName;
String pass;
boolean conditions=false;
    public SignIn(String usrName) {

        if(!SignUp.accountData.check(usrName)) {
            conditions=true;


        } else {
            conditions=false;
            System.out.println("error in sigin UserName or password is wrong ");
        }


    }

    public SignIn() {
    }

    public boolean isConditions() {
        return conditions;
    }

    public void setConditions(boolean conditions) {
        this.conditions = conditions;
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
