package com.ourTeam.portal.web.controller;

import com.ourTeam.common.pojo.EasyUIDataGrid;
import com.ourTeam.manager.pojo.CourseInfo;
import com.ourTeam.portal.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;


    @RequestMapping("/course/list")
    @ResponseBody
    public EasyUIDataGrid getCourseList(Integer page, Integer rows){
        System.out.println(page + rows);
        EasyUIDataGrid result = courseService.getCourseList(page, rows);
        return result;
    }

    @RequestMapping("/{url}")
    public String showPage(@PathVariable String url){
        return url;
    }
//@RequestMapping("/courses")
//public  String showCourses(){
//    return "courses";
//}

    @RequestMapping("/")
    public  String showIndex(){
        return "index";
    }

}
