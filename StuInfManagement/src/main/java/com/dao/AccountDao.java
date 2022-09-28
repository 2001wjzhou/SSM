package com.dao;

import com.domain.Account;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/*Repository交给ioc容器管理
* */
@Repository
public interface AccountDao {
    /*增删改查*/
    /*增加*/
    @Insert("insert into account(account,password) values (#{account},#{password})")
    public int insertAccount(Account account);
    /*删除*/
    @Delete("delete from account where account = #{account}")
    public int deleteAccount(int account);
    /*修改*/
    @Update("update account set password=#{password} where account = #{account}")
    public int updateAccount(Account account);
    /*查询所有--成功*/
    @Select("select * from account")
    public List<Account> findAll();
}
