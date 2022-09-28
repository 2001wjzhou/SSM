package com.controller;

import com.domain.Account;
import com.domain.Stuaccount;
import com.service.AccountService;
import com.service.StuaccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/*
 * 账户web
 * */
@Controller
@RequestMapping("/stuaccount")
public class StuAccountController {
    @Autowired
    private StuaccountService stuaccountService;

    @RequestMapping("/insertStuaccount")
    public void insertStuaccount(Stuaccount stuaccount, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，增加产品");
        stuaccountService.insertStuaccount(stuaccount);
        response.sendRedirect(request.getContextPath()+"/stuaccount/findAll");
    }

    @RequestMapping("/deleteStuaccount")
    public void deleteStuaccount(Stuaccount stuaccount,HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，删除学生账户"+stuaccount);
        stuaccountService.deleteStuaccount(stuaccount);
        response.sendRedirect(request.getContextPath()+"/stuaccount/findAll");
    }
    @RequestMapping("/updateStuaccount")
    public void updateStuaccount(Stuaccount stuaccount,HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，更新产品");
        stuaccountService.updateStuaccount(stuaccount);
        response.sendRedirect(request.getContextPath()+"/stuaccount/findAll");
    }

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层，查询所有");
        List<Stuaccount> list=stuaccountService.findAll();
        System.out.println("b表现层"+list);
        model.addAttribute("sactlist",list);
        return "sactlist";
    }

}
