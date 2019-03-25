package com.ourTeam.userCenter.impl;

import com.ourTeam.common.pojo.CoursesResult;
import com.ourTeam.manager.dao.CourseInfoMapper;
import com.ourTeam.manager.dao.UserCourseMapper;
import com.ourTeam.manager.dao.UserMapper;
import com.ourTeam.manager.pojo.*;
import com.ourTeam.userCenter.UserCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("userCenterServiceImpl")
public class UserCenterServiceImpl implements UserCenterService {

    @Autowired
    private UserCourseMapper userCourseMapper;

    @Autowired
    private CourseInfoMapper courseInfoMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<CourseInfo> getCoursesByUserId(long userId) {
        UserCourseExample userCourseExample = new UserCourseExample();
        UserCourseExample.Criteria criteria = userCourseExample.createCriteria();
        int userIds = (int)userId;
        criteria.andUserIdEqualTo(userIds);
        List<UserCourse> result = userCourseMapper.selectByExample(userCourseExample);
        List<CourseInfo> result1 = new ArrayList<>();
        for(UserCourse userCourse : result){
            int courseId = userCourse.getCourId();
            CourseInfo courseInfo = courseInfoMapper.selectByPrimaryKey((long)courseId);
            result1.add(courseInfo);
        }
        return result1;
    }

    @Override
    public CoursesResult delectCourse(long userId, long courseId) {
        UserCourseExample userCourseExample = new UserCourseExample();
        UserCourseExample.Criteria criteria = userCourseExample.createCriteria();
        criteria.andUserIdEqualTo((int)userId);
        criteria.andCourIdEqualTo((int)courseId);
        int result = userCourseMapper.deleteByExample(userCourseExample);
        if(result > 0) return CoursesResult.ok();
        else return CoursesResult.build(404,"删除失败");
    }

    @Override
    public CoursesResult updateUserInfo(long userId, String userName, String userPhone) {
        User user = userMapper.selectByPrimaryKey(userId);
        if(user == null) return CoursesResult.build(404,"更改个人信息失败");
        user.setUsername(userName);
        user.setPhone(userPhone);
        user.setUpdated(new Date());
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(userId);
        int result = userMapper.updateByExample(user,userExample);
        if(result > 0) return CoursesResult.ok();
        else return  CoursesResult.build(404,"更改个人信息失败");
    }

    @Override
    public CoursesResult changeUserPassword(long userId, String oldPassword, String newPassword) {
        User user = userMapper.selectByPrimaryKey(userId);
        String oldPassword1 = user.getPassword();
        if(! oldPassword.equals(oldPassword)) return CoursesResult.build(404,"用户名或密码错误");
        newPassword = DigestUtils.md5DigestAsHex(newPassword.getBytes());
        user.setPassword(newPassword);
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(userId);
        int result = userMapper.updateByExample(user,userExample);
        return CoursesResult.ok();
    }

    @Override
    public CoursesResult userChangeComment(long userId, long courId, String remark, int star) {
        UserCourseExample example = new UserCourseExample();
        UserCourseExample.Criteria criteria = example.createCriteria();
        criteria.andCourIdEqualTo((int)courId);
        criteria.andUserIdEqualTo((int)userId);
        List<UserCourse> result = userCourseMapper.selectByExample(example);
        if(result.size() > 0){
            UserCourse userCourse = result.get(0);
            userCourse.setCourComment(remark);
            userCourse.setCourStar(star);
            int result1 =userCourseMapper.updateByExample(userCourse,example);
            if(result1 > 0) return CoursesResult.ok();
        }
        return CoursesResult.build(404,"评价失败");
    }
}
