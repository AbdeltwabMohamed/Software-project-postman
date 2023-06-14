package com.Advanced.Software_Project.AccoutsModels;

import com.Advanced.Software_Project.Services.Services;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;
@Component
public class AccountData {
    public static Vector<String> mobile=new Vector<String>();
   public static Vector<String>InternetPayment =new Vector<String>();
    public static Vector<String>landline =new Vector<String>();
    public static Vector<String>donation= new Vector<String>();
    public static LinkedList<AdminAccount> AdminAccounts=new LinkedList<AdminAccount>();
    public static LinkedList<UserAccount> CustomerAccounts=new LinkedList<UserAccount>();
    public static LinkedList<Services> Addtowallet=new LinkedList<Services>();

    Map<String,String> users=new HashMap();
    boolean check(String UsrName){
        boolean flag=true;
        for (Map.Entry<String,String> me:users.entrySet()){
            if(me.getKey()==UsrName){
                flag=false;
                break;
            }

        }
        return flag;
    }
}
