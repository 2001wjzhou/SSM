package com.service.impl;

import com.dao.ClassDao;
import com.dao.CourseTeaacherDao;
import com.domain.Class_inf;
import com.domain.course_teacher;
import com.service.ClassService;
import com.service.CourseTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CourseTeacherService")
public class CourseTeacherServiceImpl implements CourseTeacherService {
    @Autowired
    private CourseTeaacherDao courseTeaacherDao;
    @Override
    public int insertCourseTeacher(course_teacher cteacher) {
        System.out.println("业务层，添加课程");
        courseTeaacherDao.insertCourseTeacher(cteacher);
        return 0;
    }

    @Override
    public int deleteCourseTeacher(String courseId) {
        System.out.println("业务层，删除课程");
        courseTeaacherDao.deleteCourseTeacher(courseId);
        return 0;
    }

    @Override
    public int updateCourseTeacher(course_teacher cteacher) {
        System.out.println("业务层，修改课程");
        courseTeaacherDao.updateCourseTeacher(cteacher);
        return 0;
    }

    @Override
    public List<course_teacher> findAll() {
        courseTeaacherDao.findAll();
        System.out.println("业务层，查看课程");
        return courseTeaacherDao.findAll();
    }
}
