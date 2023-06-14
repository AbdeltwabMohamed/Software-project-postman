package com.Advanced.Software_Project.AccoutsModels;

import org.springframework.stereotype.Component;

@Component
public class AdminAccount extends Account {
    public AdminAccount(AdminAccountData a) {
        this.pass=a.pass;
        this.username=a.name;
        AccountData.AdminAccounts.add(this);
    }

    public AdminAccount() {
    }
    public AdminAccount(String name) {
    }
}
