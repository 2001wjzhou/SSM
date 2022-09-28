package com.service.impl;

import com.dao.ScoreDao;

import com.domain.score_inf;
import com.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ScoreService")
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreDao scoreDao;

    @Override
    public int insertScore(score_inf score) {
        System.out.println("业务层，增加学生成绩");
        scoreDao.insertScore(score);
        return 0;
    }

    @Override
    public int deleteScore(int l) {
        System.out.println("业务层，删除学生成绩");
        scoreDao.deleteScore(l);
        return 0;
    }

    @Override
    public int updateScore(score_inf score) {
        System.out.println("业务层，更新学生成绩");
        scoreDao.updateScore(score);
        return 0;
    }

    @Override
    public List<score_inf> findAll() {
        System.out.println("业务层，列出学生成绩");
        scoreDao.findAll();
        return scoreDao.findAll();
    }

    @Override
    public List<score_inf> findById(int id) {
        System.out.println("业务层，根据学号查询成绩信息");
        scoreDao.findById(id);
        return scoreDao.findById(id);
    }

    @Override
    public List<score_inf> findByCourseId(String courseId) {
        System.out.println("业务层，根据学号查询成绩信息");
        scoreDao.findByCourseId(courseId);
        return scoreDao.findByCourseId(courseId);
    }

    @Override
    public List<score_inf> findByName(String name) {
        System.out.println("业务层，根据姓名查询成绩--多表查询");
        scoreDao.findByName(name);
        System.out.println(scoreDao.findByName(name));
        return scoreDao.findByName(name);
    }
}
