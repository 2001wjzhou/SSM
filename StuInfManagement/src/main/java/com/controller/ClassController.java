package com.controller;

import com.domain.Basic_inf;
import com.domain.Class_inf;
import com.service.BasicinfService;
import com.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/classinf")
public class ClassController {

        @Autowired
        private ClassService classService;

        @RequestMapping("/insertclassinf")
        public void insertclassinf(Class_inf class_inf, HttpServletRequest request, HttpServletResponse response) throws
        IOException {
        System.out.println("表现层，增加学生班级信息");
        classService.insertClassinf(class_inf);
        response.sendRedirect(request.getContextPath()+"/classinf/findAll");
    }

        @RequestMapping("/deleteclassinf")
        public void deleteclassinf(int id,HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，删除学生班级信息");
        classService.deleteClassinf(id);
        response.sendRedirect(request.getContextPath()+"/classinf/findAll");
    }
        @RequestMapping("/updateclassinf")
        public void updateclassinf(Class_inf class_inf, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，更新学生班级信息");
        classService.updateClassinf(class_inf);
        response.sendRedirect(request.getContextPath()+"/classinf/findAll");
    }

        @RequestMapping("/findAll")
        public String findAll(Model model){
        System.out.println("表现层，查询学生班级信息");
        List<Class_inf> list=classService.findAll();
        System.out.println("表现层"+list);
        model.addAttribute("classinflist",list);
        return "classinflist";
    }


}
