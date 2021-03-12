package com.henashi.dao;

import java.util.Date;
import java.util.List;

public class AccountDaoImpl implements AccountDao{

    private String test;
    private Date date;
    private List<String> list;
    public void setList(List<String> list) {
        this.list = list;
        System.out.println(list);
    }


    public void setDate(Date date) {
        this.date = date;
        System.out.println(date);
    }

    public void saveAccount() {
        System.out.println("保存了账户");
    }

    public void setTest(String test) {
        this.test=test;
        System.out.println(test);
    }
}
