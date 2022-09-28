package com.service;

import com.domain.Class_inf;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/*Repository交给ioc容器管理
* */
public interface ClassService {
    /*增删改查*/
    /*增加*/
    public int insertClassinf(Class_inf class_inf);
    /*删除*/
    public int deleteClassinf(int id);
    /*修改*/
    public int updateClassinf(Class_inf class_inf);
    /*查询所有--成功*/
    public List<Class_inf> findAll();
}
