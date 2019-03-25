package com.ourTeam.portal.web.controller;

import com.ourTeam.common.pojo.CoursesResult;
import com.ourTeam.courseInfo.CourseInfoService;
import com.ourTeam.manager.pojo.CourseDetail;
import com.ourTeam.manager.pojo.CourseInfo;
import com.ourTeam.manager.pojo.User;
import com.ourTeam.manager.pojo.UserCourse;
import com.ourTeam.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
*   课程详情页面
*/
@Controller
public class CourseInfoController {


    @Autowired
    private CourseInfoService courseInfoService;

    @Autowired
    private UserService userService;

    /**
     * 返回课程详情页面
     * @param id
     * @param model
     * @author lzy
     * @return
     */
    @RequestMapping("/courseInfo/{id}")
    public String getCourseInfo(@PathVariable long id, Model model){
        CourseInfo result =  courseInfoService.getCourse(id);
        model.addAttribute("cour_name",result.getCourName());
        model.addAttribute("cour_code",result.getCourCode());
        model.addAttribute("sch_name",result.getSchName());
        model.addAttribute("cour_info",result.getCourInfo());
        model.addAttribute("cour_selectNum",result.getCourSelectnum());
        model.addAttribute("cour_totalNum",result.getCourTotalnum());
        model.addAttribute("courseId",id);
        String cour_code = result.getCourCode();
        //得到课程简介
        CourseDetail detail = courseInfoService.getCourseDetail(cour_code);
        try{
            if(detail.getCourDetail() != null){
                model.addAttribute("cour_intro",detail.getCourDetail());
            }
        }catch (Exception e){
            model.addAttribute("cour_intro","没有与该课程相关的简介");
        }

        //查看课程评价
        List<UserCourse> userCourses = courseInfoService.getCourseComment(id);
        int countStar = 0;
        if(userCourses.size() != 0){
            for(UserCourse user:userCourses){
                if(user.getCourStar() != null){
                    countStar += user.getCourStar();
                }
            }
            countStar = countStar/userCourses.size();
        }
        //总评价星星的个数
        model.addAttribute("average_star",(countStar+2)/16);
        //总评价星星的像素值
        model.addAttribute("averagr_star_px",(countStar+2)/16*20);
        model.addAttribute("userCourses",userCourses);
        return "course_info";
    }

    /**
     * 根据用户token和课程id加入课程
     * @param courseId
     * @param token
     * @return
     */
    @RequestMapping("/user/selectCourse/{courseId}/{token}")
    @ResponseBody
    public CoursesResult userSelectCourse(@PathVariable long courseId,@PathVariable String token){
        //先根据用户的token从redis中取出用户信息
        CoursesResult result = userService.userLoginByToken(token);
        User user = (User)result.getData();
        CoursesResult coursesResult = null;
        if(user != null){
            long userId = user.getId().longValue();
            coursesResult = courseInfoService.userSelectCourse(userId,courseId);
            return coursesResult;
        }
        return coursesResult.build(404,"选课失败");
    }

    /**
     * 课程详情页关于用户是否已经选择该课的检查
     * @param courseId
     * @param token
     * @return
     */
    @RequestMapping("/checkStatus/{courseId}/{token}")
    @ResponseBody
    public CoursesResult checkStatus(@PathVariable long courseId,@PathVariable String token){
        CoursesResult result = userService.userLoginByToken(token);
        User user = (User)result.getData();
        CoursesResult coursesResult = null;
        if(user != null){
            long userId = user.getId().longValue();
            coursesResult = courseInfoService.checkStatus(userId,courseId);
            return coursesResult;
        }
        return coursesResult.build(404,"用户没有选择过这门课");
    }
}
