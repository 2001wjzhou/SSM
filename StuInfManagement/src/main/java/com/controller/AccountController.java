package com.controller;

import com.domain.Account;
import com.service.AccountService;
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
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/insertAccount")
    public void saveProduct(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，增加产品");
        accountService.insertAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }

    @RequestMapping("/deleteAccount")
    public void deleteProdect(int id,HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，删除产品");
        accountService.deleteAccount(id);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }
    @RequestMapping("/updateAccount")
    public void updateProduct(Account account,HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，更新产品");
        accountService.updateAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层，查询所有");
        List<Account> list=accountService.findAll();
        System.out.println("b表现层"+list);
        model.addAttribute("actlist",list);
        return "actlist";
    }

}
