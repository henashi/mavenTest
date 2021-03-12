package com.henashi.client;

import com.henashi.dao.AccountDao;
import com.henashi.dao.AccountDaoImpl;
import com.henashi.service.AccountServiceImplement;
import com.henashi.service.AccountServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountDao adao = ac.getBean("dao", AccountDaoImpl.class);
        AccountServiceInterface serv = (AccountServiceImplement) ac.getBean("service", AccountServiceImplement.class);
        serv.saveAccount();
    }
}
