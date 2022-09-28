package com.dao;

import com.domain.Account;

import com.domain.Basic_inf;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/*Repository交给ioc容器管理
 * */
@Repository
public interface BasicinfDao {
    /*增删改查*/
    /*增加*/
    @Insert("insert into basic_inf(id,name,sex,address,age) values (#{id},#{name},#{sex},#{address},#{age})")
    public int insertBasicinf(Basic_inf basic_inf);
    /*删除*/
    @Delete("delete from basic_inf where id = #{id}")
    public int deleteBasicinf(int id);
    /*修改*/
    @Update("update basic_inf set name = #{name},sex=#{sex},address=#{address},age=#{age} where id = #{id}")
    public int updateBasicinf(Basic_inf basic_inf);
    /*查询所有--成功*/
    @Select("select * from basic_inf")
    public List<Basic_inf> findAll();
}
