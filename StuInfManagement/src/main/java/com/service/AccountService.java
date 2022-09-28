package com.service;

import com.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountService {
    /*增删改查*/
    /*增加*/
    public int insertAccount(Account account);
    /*删除*/
    public int deleteAccount(int account);
    /*修改*/
    public int updateAccount(Account account);
    /*查询所有--成功*/
    public List<Account> findAll();
}
