package com.controller;

import com.domain.Class_inf;
import com.domain.course_teacher;
import com.service.ClassService;
import com.service.CourseTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/cteacherinf")
public class CourseTeacherController {

        @Autowired
        private CourseTeacherService courseTeacherService;

        @RequestMapping("/insertcteacherinf")
        public void insertclassinf(course_teacher cteacher, HttpServletRequest request, HttpServletResponse response) throws
        IOException {
        System.out.println("表现层，增加学生班级信息");
            courseTeacherService.insertCourseTeacher(cteacher);
        response.sendRedirect(request.getContextPath()+"/cteacherinf/findAll");
    }

        @RequestMapping("/deletecteacherinf")
        public void deleteclassinf(String courseId,HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，删除学生班级信息");
        courseTeacherService.deleteCourseTeacher(courseId);
        response.sendRedirect(request.getContextPath()+"/cteacherinf/findAll");
    }
        @RequestMapping("/updatecteacherinf")
        public void updateclassinf(course_teacher cteacher, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，更新学生班级信息");
        courseTeacherService.updateCourseTeacher(cteacher);
        response.sendRedirect(request.getContextPath()+"/cteacherinf/findAll");
    }

        @RequestMapping("/findAll")
        public String findAll(Model model){
        System.out.println("表现层，查询学生班级信息");
        List<course_teacher> list=courseTeacherService.findAll();
        System.out.println("表现层"+list);
        model.addAttribute("cteacherlist",list);
        return "cteacherlist";
    }


}
