package com.service.impl;

import com.dao.StuaccountDao;
import com.domain.Account;
import com.domain.Stuaccount;
import com.service.AccountService;
import com.service.StuaccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StuaccountService")
public class StuaccountServiceImpl implements StuaccountService {
    @Autowired
    private StuaccountDao stuaccountDao;

    @Override
    public int insertStuaccount(Stuaccount stuaccount) {
        System.out.println("业务层，添加学生账户");
        stuaccountDao.insertStuaccount(stuaccount);
        return 0;
    }

    @Override
    public int deleteStuaccount(Stuaccount stuaccount) {
        System.out.println("业务层，删除学生账户");
        System.out.println(stuaccount);
        stuaccountDao.deleteStuaccount(stuaccount);
        return 0;
    }

    @Override
    public int updateStuaccount(Stuaccount stuaccount) {
        System.out.println("业务层，更新学生账户");
        stuaccountDao.updateStuaccount(stuaccount);
        return 0;
    }

    @Override
    public List<Stuaccount> findAll() {
        System.out.println("业务层，列出学生账户");
        stuaccountDao.findAll();
        return stuaccountDao.findAll();
    }
}
