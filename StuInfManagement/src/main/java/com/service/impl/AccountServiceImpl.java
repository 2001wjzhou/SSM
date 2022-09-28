package com.service.impl;

import com.dao.AccountDao;
import com.domain.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("AccountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public int insertAccount(Account account) {
        System.out.println("业务层，增加account");
        accountDao.insertAccount(account);
        return 0;
    }

    @Override
    public int deleteAccount(int account) {
        System.out.println("业务层，删除account");
        accountDao.deleteAccount(account);
        return account;
    }

    @Override
    public int updateAccount(Account account) {
        System.out.println("业务层 修改account");
        accountDao.updateAccount(account);
        return 0;
    }

    @Override
    public List<Account> findAll() {
        System.out.println("业务层 列出所有account");
        accountDao.findAll();
        System.out.println(accountDao.findAll());
        return accountDao.findAll();
    }
}
