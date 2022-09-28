package com.service;


import com.domain.score_inf;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/*Repository交给ioc容器管理
* */

public interface ScoreService {
    /*增删改查*/
    /*增加*/
    public int insertScore(score_inf score);
    /*删除*/
    public int deleteScore(int l);
    /*修改*/
    public int updateScore(score_inf score);
    /*查询所有--成功*/
    public List<score_inf> findAll();

    public List<score_inf> findById(int id);
    public List<score_inf> findByCourseId(String courseId);
    public List<score_inf> findByName(String name);
}
