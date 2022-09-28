package com.controller;

import com.domain.Account;
import com.domain.Basic_inf;
import com.service.AccountService;
import com.service.BasicinfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@Controller
@RequestMapping("/basicinf")
public class BasicinfController {

        @Autowired
        private BasicinfService basicinfService;

        @RequestMapping("/insertbasicinf")
        public void insertbasicinf(Basic_inf basic_inf, HttpServletRequest request, HttpServletResponse response) throws
        IOException {
        System.out.println("表现层，增加学生基本信息");
            basicinfService.insertBasicinf(basic_inf);
        response.sendRedirect(request.getContextPath()+"/basicinf/findAll");
    }

        @RequestMapping("/deletebasicinf")
        public void deletebasicinf(int id,HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，删除学生基本信息");
            basicinfService.deleteBasicinf(id);
        response.sendRedirect(request.getContextPath()+"/basicinf/findAll");
    }
        @RequestMapping("/updatebasicinf")
        public void updatebasicinf(Basic_inf basic_inf, javax.servlet.http.HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，更新学生基本信息");
            basicinfService.updateBasicinf(basic_inf);
        response.sendRedirect(request.getContextPath()+"/basicinf/findAll");
    }

        @RequestMapping("/findAll")
        public String findAll(Model model){
        System.out.println("表现层，查询学生基本信息");
        List<Basic_inf> list=basicinfService.findAll();
        System.out.println("b表现层"+list);
        model.addAttribute("basicinflist",list);
        return "basicinflist";
    }


}
