package com.controller;

import com.domain.Account;
import com.domain.User;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@SessionAttributes(value = {"msg"})
public class UserController {
    @Autowired
    private AccountService accountService;
    /*登陆初始化界面*/
    @RequestMapping("/toLogin")
    public String initLogin(){
        return "login";
    }
    /*处理登录功能*/
    @RequestMapping("/login")
    public String login(User user, Model model, HttpSession session){
        System.out.println(user.getUname());
        List<Account> lists=accountService.findAll();
        for (Account list:lists) {
            if(list.getAccount().equals(user.getUname())&&list.getPassword().equals(user.getUpwd())){
                //登陆成功，将用户信息保存到session中
                session.setAttribute("user",user);
                //重定向到主页面的跳转方法
                return "redirect:teacherimpl";
            }
        }

        model.addAttribute("msg","用户名或密码错误，请重新登录！");
        return "login";
    }
    /*跳转到主页面*/
    @RequestMapping("/teacherimpl")
    public String toMain(){
        return "teacherimpl";
    }
    /*退出登录*/
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        //清楚session
        session.invalidate();
        /*return "login";*/
        return "redirect:/ ";
    }
    @RequestMapping("/fileupload")
    public String fileupload(HttpServletRequest request, MultipartFile upload) throws IOException {
        System.out.println("SpringMVC文件上传");
        //使用fileupload组件完成文件上传
        //上传的位置
        String path=request.getSession().getServletContext().getRealPath("/uploads/");
        File file=new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        //说明上传文件项，获取上传文件的名称
        String filename=upload.getOriginalFilename();
        System.out.println(filename);
        //把文件名称设置唯一值，uuid
        String uuid= UUID.randomUUID().toString().replace("-","");
        filename=uuid+"_"+filename;
        //完成文件上传
        upload.transferTo(new File(path,filename));
        return "success";

    }
}
