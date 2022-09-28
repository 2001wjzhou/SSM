package com.dao;

import com.domain.Account;
import com.domain.Stuaccount;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/*Repository交给ioc容器管理
* */
@Repository
public interface StuaccountDao {
    /*增删改查*/
    /*增加*/
    @Insert("insert into stuaccount(account,password) values (#{account},#{password})")
    public int insertStuaccount(Stuaccount stuaccount);
    /*删除*/
    @Delete("delete from stuaccount where account = #{account}")
    public int deleteStuaccount(Stuaccount stuaccount);
    /*修改*/
    @Update("update stuaccount set password=#{password} where account = #{account}")
    public int updateStuaccount(Stuaccount stuaccount);
    /*查询所有--成功*/
    @Select("select * from stuaccount")
    public List<Stuaccount> findAll();
}
