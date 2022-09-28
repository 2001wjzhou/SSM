package com.controller;

import com.domain.Account;
import com.domain.Stuaccount;
import com.domain.User;
import com.service.AccountService;
import com.service.StuaccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@SessionAttributes(value = {"Smsg"})
public class SUserController {
    @Autowired
    private StuaccountService stuaccountService;
    /*登陆初始化界面*/
   @RequestMapping("/StoLogin")
    public String initLogin(){
       return "Slogin";
   }
   /*处理登录功能*/
    @RequestMapping("/Slogin")
    public String login(User user, Model model, HttpSession session){
        System.out.println(user.getUname());
        List<Stuaccount> lists=stuaccountService.findAll();
        for (Stuaccount list:lists) {
            if(list.getAccount().equals(user.getUname())&&list.getPassword().equals(user.getUpwd())){
                //登陆成功，将用户信息保存到session中
                session.setAttribute("user",user);
                //重定向到主页面的跳转方法
                return "redirect:studentimpl";
            }
        }

        model.addAttribute("Smsg","用户名或密码错误，请重新登录！");
        return "Slogin";
    }
    /*跳转到主页面*/
    @RequestMapping("/studentimpl")
    public String toMain(){
        return "studentimpl";
    }
    /*退出登录*/
    @RequestMapping("/Slogout")
    public String logout(HttpSession session){
        //清楚session
        session.invalidate();
       /* return "Slogin";*/
        return "redirect:/ ";
    }
}
