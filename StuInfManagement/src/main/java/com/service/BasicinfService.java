package com.service;

import com.domain.Account;
import com.domain.Basic_inf;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BasicinfService {
    /*增删改查*/
    /*增加*/
    public int insertBasicinf(Basic_inf basic_inf);
    /*删除*/
    public int deleteBasicinf(int id);
    /*修改*/
    public int updateBasicinf(Basic_inf basic_inf);
    /*查询所有--成功*/
    public List<Basic_inf> findAll();
}
