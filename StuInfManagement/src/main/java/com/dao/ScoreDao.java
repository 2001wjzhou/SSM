package com.dao;

import com.domain.Account;

import com.domain.score_inf;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/*Repository交给ioc容器管理
* */
@Repository
public interface ScoreDao {
    /*增删改查*/
    /*增加*/
    @Insert("insert into score_inf(id,courseId,score) values (#{id},#{courseId},#{score})")
    public int insertScore(score_inf score);
    /*删除*/
    @Delete("delete from score_inf where l = #{l}")
    public int deleteScore(int l);
    /*修改*/
    @Update("update score_inf set id = #{id},courseId=#{courseId},score=#{score} where l = #{l}")
    public int updateScore(score_inf score);
    /*查询所有--成功*/
    @Select("select * from score_inf")
    public List<score_inf> findAll();
    @Select("select * from score_inf where id=#{id}")
    public List<score_inf> findById(int id);
    @Select("select * from score_inf where courseId=#{courseId}")
    public List<score_inf> findByCourseId(String courseId);
    @Select("select score_inf.* from score_inf,basic_inf where score_inf.id=basic_inf.id and name=#{name}")
    public List<score_inf> findByName(String name);
}
