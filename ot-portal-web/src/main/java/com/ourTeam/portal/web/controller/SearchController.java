package com.ourTeam.portal.web.controller;



import com.ourTeam.common.pojo.CoursesResult;
import com.ourTeam.search.SearchResult;
import com.ourTeam.search.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;



    /**
     * 用于接收前台的搜索请求
     * @param search：搜索关键字
     * @param page：当前页面
     * @param rows：每页显示的行数
     * @return
     */
    @RequestMapping(value = "/search/q")
    @ResponseBody
    public CoursesResult search(@RequestParam(defaultValue = "" )String search,
                                @RequestParam(defaultValue = "1") Integer page,
                                @RequestParam(defaultValue = "10")Integer rows){

        try {
            search = new String(search.getBytes("iso8859-1"), "utf-8");
            System.out.println(search);
            SearchResult result = searchService.search(search, page, rows);
            System.out.println(result.getCourseInfoList().size());
            System.out.println(result.getCourseInfoList().get(9).getCourName());

            return CoursesResult.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
            return CoursesResult.build(500,"错误");
        }

    }
}
