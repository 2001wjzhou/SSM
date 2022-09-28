package com.service;

import com.domain.Account;
import com.domain.Stuaccount;

import java.util.List;

public interface StuaccountService {
    /*增删改查*/
    /*增加*/
    public int insertStuaccount(Stuaccount stuaccount);
    /*删除*/
    public int deleteStuaccount(Stuaccount stuaccount);
    /*修改*/
    public int updateStuaccount(Stuaccount stuaccount);
    /*查询所有--成功*/
    public List<Stuaccount> findAll();
}
