package com.dao;

import com.domain.Account;
import com.domain.course_teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/*Repository交给ioc容器管理
* */
@Repository
public interface CourseTeaacherDao {
    /*增删改查*/
    /*增加*/
    @Insert("insert into course_teacher(courseId,course,teacher) values (#{courseId},#{course},#{teacher})")
    public int insertCourseTeacher(course_teacher cteacher);
    /*删除*/
    @Delete("delete from course_teacher where courseId = #{courseId}")
    public int deleteCourseTeacher(String courseId);
    /*修改*/
    @Update("update course_teacher set course = #{course},teacher=#{teacher} where courseId = #{courseId}")
    public int updateCourseTeacher(course_teacher cteacher);
    /*查询所有--成功*/
    @Select("select * from course_teacher")
    public List<course_teacher> findAll();
}
