package com.controller;

import com.domain.Stuaccount;

import com.domain.score_inf;
import com.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;
    @RequestMapping("/insertScore")
    public void insertStuaccount(score_inf score, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，增加成绩信息");
        scoreService.insertScore(score);
        response.sendRedirect(request.getContextPath()+"/score/findAll");
    }

    @RequestMapping("/deleteScore")
    public void deleteStuaccount(int L,HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，删除成绩信息"+L);
        scoreService.deleteScore(L);
        response.sendRedirect(request.getContextPath()+"/score/findAll");
    }
    @RequestMapping("/updateScore")
    public void updateStuaccount(score_inf score,HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，更新成绩信息");
        scoreService.updateScore(score);
        response.sendRedirect(request.getContextPath()+"/score/findAll");
    }

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层，查询成绩信息");
        List<score_inf> list=scoreService.findAll();
        System.out.println("b表现层"+list);
        model.addAttribute("scorelist",list);
        return "scorelist";
    }
    @RequestMapping("/findById")
    public String findById(Model model,int id){
        System.out.println("表现层，查询成绩信息");
        List<score_inf> list=scoreService.findById(id);
        System.out.println("b表现层"+list);
        model.addAttribute("scorelist",list);
        return "scorelist";
    }
    @RequestMapping("/findByCourseId")
    public String findByCourseId(Model model,String courseId){
        System.out.println("表现层，查询成绩信息");
        List<score_inf> list=scoreService.findByCourseId(courseId);
        System.out.println("b表现层"+list);
        model.addAttribute("scorelist",list);
        return "scorelist";
    }

    @RequestMapping("/findByName")
    public String findByName(Model model,String name){
        System.out.println("表现层，查询成绩信息");
        List<score_inf> list=scoreService.findByName(name);
        System.out.println("b表现层"+list);
        model.addAttribute("scorelist",list);
        return "scorelist";
    }
}
