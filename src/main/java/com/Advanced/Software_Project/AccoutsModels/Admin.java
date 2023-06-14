package com.Advanced.Software_Project.AccoutsModels;
import com.Advanced.Software_Project.Services.Services;
import com.Advanced.Software_Project.PaymentModels.Discount;
import org.springframework.stereotype.Component;
import com.Advanced.Software_Project.AccoutsModels.Account;

import java.util.*;

@Component
public class Admin {
     public static Discount   discound;
    Account account;
    public AccountData accountData;
     public static boolean Overall=false;
   public static ArrayList<Customer> list = new ArrayList();
    public static Map<Customer,Services> refunds=new HashMap<Customer,Services>();
    public Vector<Integer> amount=new Vector<Integer>();

    public SignUp signUp;
    public SignIn signin;
    public boolean signed=false;





    public Admin(){}


}
