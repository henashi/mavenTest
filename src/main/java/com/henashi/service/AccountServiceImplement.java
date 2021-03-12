package com.henashi.service;


import com.henashi.dao.AccountDao;
import com.henashi.dao.AccountDaoImpl;

public class AccountServiceImplement implements AccountServiceInterface {
    AccountDao dao = new AccountDaoImpl();

    public void saveAccount() {
        dao.saveAccount();
    }
}
