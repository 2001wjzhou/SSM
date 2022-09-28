package com.controller;

import com.domain.Basic_inf;
import com.domain.Class_inf;
import com.domain.course_teacher;
import com.domain.score_inf;
import com.service.BasicinfService;
import com.service.ClassService;
import com.service.CourseTeacherService;
import com.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private ScoreService scoreService;
    @Autowired
    private ClassService classService;
    @Autowired
    private CourseTeacherService courseTeacherService;
    @Autowired
    private BasicinfService basicinfService;
    /*查看成绩*/
    @RequestMapping("/score")
    public String score(Model model){
        System.out.println("表现层，查询所有");
        List<score_inf> list=scoreService.findAll();
        System.out.println("b表现层"+list);
        model.addAttribute("scorelist",list);
        return "Sscorelist";
    }
    @RequestMapping("/classinf")
    public String classinf(Model model){
        System.out.println("表现层，查询学生班级信息");
        List<Class_inf> list=classService.findAll();
        System.out.println("表现层"+list);
        model.addAttribute("classinflist",list);
        return "Sclassinflist";
    }
    @RequestMapping("/cteacher")
    public String cteacher(Model model){
        System.out.println("表现层，查询学生班级信息");
        List<course_teacher> list=courseTeacherService.findAll();
        System.out.println("表现层"+list);
        model.addAttribute("cteacherlist",list);
        return "Scteacherlist";
    }
    @RequestMapping("basicinf")
    public String basicinf(Model model){
        System.out.println("表现层，查询学生基本信息");
        List<Basic_inf> list=basicinfService.findAll();
        System.out.println("b表现层"+list);
        model.addAttribute("basicinflist",list);
        return "Sbasicinflist";
    }
}
