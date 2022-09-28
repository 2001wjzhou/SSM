package com.service.impl;

import com.dao.BasicinfDao;
import com.domain.Basic_inf;
import com.service.BasicinfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("BasicinfService")
public class BasicinfServiceImpl implements BasicinfService {
    @Autowired
    private BasicinfDao basicinfDao;
    @Override
    public int insertBasicinf(Basic_inf basic_inf) {
        System.out.println("业务层，增加学生基本信息");
        basicinfDao.insertBasicinf(basic_inf);
        return 0;
    }

    @Override
    public int deleteBasicinf(int id) {
        System.out.println("业务层，删除学生基本信息");
        basicinfDao.deleteBasicinf(id);
        return 0;
    }

    @Override
    public int updateBasicinf(Basic_inf basic_inf) {
        System.out.println("业务层，更新学生基本信息");
        basicinfDao.updateBasicinf(basic_inf);
        return 0;
    }

    @Override
    public List<Basic_inf> findAll() {
        System.out.println("业务层，列出学生基本信息");
        basicinfDao.findAll();
        return basicinfDao.findAll();
    }
}
