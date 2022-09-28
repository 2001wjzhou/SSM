package com.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object object) throws ServletException, IOException {
        //获取请求的URL
        String url=request.getRequestURI();
        //login.jsp或登录请求放行，拦截器
        if(url.indexOf("/toLogin")>=0||url.indexOf("/login")>=0){
            System.out.println(url.indexOf("/toLogin"));
            System.out.println(url.indexOf("/login"));
            return true;
        }
        //获取session
        HttpSession session=request.getSession();
        Object obj=session.getAttribute("user");
        if(obj!=null){
            System.out.println("obj不为空");
            return true;
        }
        //没有登录界面，转发到登录界面，并给出错误提示信息
        request.setAttribute("msg","还没登陆，请先登录");
        request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request,response);
        return false;
    }
}
