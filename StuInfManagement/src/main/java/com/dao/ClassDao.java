package com.dao;

import com.domain.Account;
import com.domain.Basic_inf;
import com.domain.Class_inf;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/*Repository交给ioc容器管理
* */
@Repository
public interface ClassDao {
    /*增删改查*/
    /*增加*/
    @Insert("insert into class_inf(id,name,majorclass) values (#{id},#{name},#{majorclass})")
    public int insertClassinf(Class_inf class_inf);
    /*删除*/
    @Delete("delete from class_inf where id = #{id}")
    public int deleteClassinf(int id);
    /*修改*/
    @Update("update class_inf set name = #{name},majorclass=#{majorclass} where id = #{id}")
    public int updateClassinf(Class_inf class_inf);
    /*查询所有--成功*/
    @Select("select * from class_inf")
    public List<Class_inf> findAll();
}
