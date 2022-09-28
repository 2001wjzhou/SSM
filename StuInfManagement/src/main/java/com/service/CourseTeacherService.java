package com.service;

import com.domain.Class_inf;
import com.domain.course_teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/*Repository交给ioc容器管理
* */
public interface CourseTeacherService {
    /*增删改查*/
    /*增加*/
    public int insertCourseTeacher(course_teacher cteacher);
    /*删除*/
    public int deleteCourseTeacher(String courseId);
    /*修改*/
    public int updateCourseTeacher(course_teacher cteacher);
    /*查询所有--成功*/
    public List<course_teacher> findAll();
}
