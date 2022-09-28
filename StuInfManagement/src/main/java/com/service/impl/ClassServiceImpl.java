package com.service.impl;

import com.dao.ClassDao;
import com.domain.Class_inf;
import com.service.BasicinfService;
import com.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ClassService")
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassDao classDao;
    @Override
    public int insertClassinf(Class_inf class_inf) {
        System.out.println("业务层，增加学生的班级信息");
        classDao.insertClassinf(class_inf);
        return 0;
    }

    @Override
    public int deleteClassinf(int id) {
        System.out.println("业务层，删除学生的班级信息");
        classDao.deleteClassinf(id);
        return 0;
    }

    @Override
    public int updateClassinf(Class_inf class_inf) {
        System.out.println("业务层，更新学生的班级信息");
        classDao.updateClassinf(class_inf);
        return 0;
    }

    @Override
    public List<Class_inf> findAll() {
        System.out.println("表现层，查看学生的班级信息，");
        classDao.findAll();
        System.out.println("表现层"+classDao.findAll());
        return classDao.findAll();
    }
}
