package com.ourTeam.portal.web.controller;

import com.ourTeam.common.pojo.CoursesResult;
import com.ourTeam.manager.dao.UserCourseMapper;
import com.ourTeam.manager.pojo.*;
import com.ourTeam.sso.service.UserService;
import com.ourTeam.userCenter.UserCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户中心
 * author:lzy
 * date:2019-03-23
 */
@Controller
public class UserCenterController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserCenterService userCenterService;

    @Autowired
    private UserCourseMapper userCourseMapper;

    /**
     * 个人中心页面登陆
     * @param token
     * @param model
     * @return
     */
    @RequestMapping("/personal/{token}")
    public String getPersonalPage(@PathVariable String token,Model model){
        //根据token去查询用户id
        //先根据用户的token从redis中取出用户信息
        CoursesResult result = userService.userLoginByToken(token);
        User user = (User)result.getData();
        List<CourseInfo> userCourses = null;
        long userId = -1;
        if(user != null) {
            userId = user.getId().longValue();
            //根据用户id去查课
            userCourses = userCenterService.getCoursesByUserId(userId);
        }
        model.addAttribute("userInfo",userCourses);
        model.addAttribute("userId",user.getId());
        List<CourseInfoAndUserCourse> courseInfoAndUserCourses = new ArrayList<>();
        if(userCourses.size() != 0){
            for(CourseInfo courseInfo: userCourses){
                CourseInfoAndUserCourse temp = new CourseInfoAndUserCourse();
                temp.setCourName(courseInfo.getCourName());
                temp.setCourInfo(courseInfo.getCourInfo());
                temp.setCourId(courseInfo.getId().intValue());
                UserCourseExample example = new UserCourseExample();
                UserCourseExample.Criteria criteria = example.createCriteria();
                criteria.andUserIdEqualTo((int)userId);
                criteria.andCourIdEqualTo(courseInfo.getId().intValue());
                List<UserCourse> userCourse = userCourseMapper.selectByExample(example);
                temp.setCourStar(userCourse.get(0).getCourStar());
                temp.setCourComment(userCourse.get(0).getCourComment());
                courseInfoAndUserCourses.add(temp);
            }
        }
        model.addAttribute("union",courseInfoAndUserCourses);
        return "personal";
    }

    /**
     * 根据用户id查询用户已经添加的课程
     * @param token
     * @param model
     * @return
     */
    @RequestMapping("/center/selectCourses/{token}")
    public CoursesResult getUserCourses(@PathVariable String token, Model model){
        //根据token去查询用户id
        //先根据用户的token从redis中取出用户信息
        CoursesResult result = userService.userLoginByToken(token);
        User user = (User)result.getData();
        CoursesResult coursesResult = null;
        List<CourseInfo> userCourses = null;
        if(user != null) {
            long userId = user.getId().longValue();
            //根据用户id去查课
             userCourses = userCenterService.getCoursesByUserId(userId);
        }
        model.addAttribute("userInfo",userCourses);
        model.addAttribute("userId",user.getId());
        return CoursesResult.ok();
    }

    /**
     * 用户删除课程
     * @param userId
     * @param courseId
     * @return
     */
    @RequestMapping("/center/deleteCourse/{userId}/{courseId}")
    @ResponseBody
    public CoursesResult deleteCourse(@PathVariable long userId,@PathVariable long courseId){
        CoursesResult result = userCenterService.delectCourse(userId,courseId);
        return result;
    }

    /**
     * 用户更改个人信息
     * @param userName
     * @param userPhone
     * @param token
     * @return
     */
    @RequestMapping("/center/changeUserInfo")
    @ResponseBody
    public CoursesResult updateUserInfo(@RequestParam String userName,@RequestParam String userPhone,@RequestParam String token) {
        //根据token去查询用户id
        //先根据用户的token从redis中取出用户信息
        CoursesResult result = userService.userLoginByToken(token);
        User user = (User) result.getData();
        CoursesResult coursesResult = null;
        if (user != null) {
            long userId = user.getId().longValue();
            coursesResult = userCenterService.updateUserInfo(userId, userName, userPhone);
        }
        return coursesResult;
    }

    /**
     * 更改密码
     * @param oldPassword
     * @param newPassword
     * @param token
     * @return
     */
    @RequestMapping("/center/changePass")
    @ResponseBody
    public CoursesResult changeUserPassword(@RequestParam String oldPassword,@RequestParam String newPassword,@RequestParam String token){
        //根据token去查询用户id
        //先根据用户的token从redis中取出用户信息
        CoursesResult result = userService.userLoginByToken(token);
        User user = (User) result.getData();
        CoursesResult coursesResult = null;
        if (user != null) {
            long userId = user.getId().longValue();
            coursesResult = userCenterService.changeUserPassword(userId,oldPassword,newPassword);
        }
        return coursesResult;
    }

    /**
     * 用户进行评价
     * @param star
     * @param remark
     * @param courId
     * @param token
     * @return
     */
    @RequestMapping("/center/changeComment")
    @ResponseBody
    public CoursesResult userComment(@RequestParam int star,@RequestParam String remark,@RequestParam long courId,@RequestParam String token)throws Exception {
        //根据token去查询用户id
        //先根据用户的token从redis中取出用户信息
        remark = new String(remark.getBytes("iso8859-1"), "utf-8");
        CoursesResult result = userService.userLoginByToken(token);
        User user = (User) result.getData();
        CoursesResult result1 = null;
        if (user != null) {
            long userId = user.getId().longValue();
            result1 = userCenterService.userChangeComment(userId, courId, remark, star);
            return  result1;
        }
        return CoursesResult.build(404,"评价失败");
    }
}
