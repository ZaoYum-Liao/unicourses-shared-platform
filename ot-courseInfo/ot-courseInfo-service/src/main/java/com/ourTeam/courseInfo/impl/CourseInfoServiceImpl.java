package com.ourTeam.courseInfo.impl;

import com.ourTeam.common.pojo.CoursesResult;
import com.ourTeam.courseInfo.CourseInfoService;
import com.ourTeam.manager.dao.CourseDetailMapper;
import com.ourTeam.manager.dao.CourseInfoMapper;
import com.ourTeam.manager.dao.UserCourseMapper;
import com.ourTeam.manager.dao.UserMapper;
import com.ourTeam.manager.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service("courseInfoServiceImpl")
public class CourseInfoServiceImpl implements CourseInfoService {

    @Autowired
    private CourseInfoMapper courseInfoMapper;

    @Autowired
    private CourseDetailMapper courseDetailMapper;

    @Autowired
    private UserCourseMapper userCourseMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public CourseInfo getCourse(long id) {

        CourseInfo courseInfo = courseInfoMapper.selectByPrimaryKey(id);
        return courseInfo;
    }

    @Override
    public CourseDetail getCourseDetail(String cour_code) {
        CourseDetail detail = courseDetailMapper.selectByPrimaryKey(cour_code);
        return detail;
    }

    @Override
    public List<UserCourse> getCourseComment(long id) {
        //根据课程id得到关于该课程的评价
        UserCourseExample userCourseExample = new UserCourseExample();
        UserCourseExample.Criteria criteria = userCourseExample.createCriteria();
        Integer ids = (int)id;
        criteria.andCourIdEqualTo(ids);
        List<UserCourse> userCourse1 = userCourseMapper.selectByExample(userCourseExample);
        Iterator<UserCourse> iterator = userCourse1.iterator();
        while(iterator.hasNext()){
            UserCourse userCourse = iterator.next();
            if(userCourse.getCourComment() == null || userCourse.getCourStar() == null){
                iterator.remove();
            }
        }
        for(UserCourse userCourse:userCourse1){
            int starCount = userCourse.getCourStar()*16-2;
            userCourse.setCourStar(starCount);
        }
        return  userCourse1;
    }

    @Override
    public CoursesResult userSelectCourse(long userId, long courseId) {
        //根据用户id查询到用户和根据课程id得到课程名
        User user = userMapper.selectByPrimaryKey(userId);
        CourseInfo courseInfo = courseInfoMapper.selectByPrimaryKey(courseId);
        UserCourse userCourse = new UserCourse();
        int userIds = (int)userId;
        int courseIds = (int)courseId;
        userCourse.setUserId(userIds);
        userCourse.setCourId(courseIds);
        userCourse.setCourName(courseInfo.getCourName());
        userCourse.setUserName(user.getUsername());
        int result = userCourseMapper.insert(userCourse);
        if(result > 0){
            //如果result结果大于0，说明选课成功，要更新课程信息表里面的选课人数
            courseInfo.setCourSelectnum(courseInfo.getCourSelectnum()+1);
            courseInfoMapper.updateByPrimaryKey(courseInfo);
            return CoursesResult.ok();
        }
        else return CoursesResult.build(400,"选课失败");

    }

    @Override
    public CoursesResult checkStatus(long userId, long courseId) {
        UserCourseExample userCourseExample = new UserCourseExample();
        UserCourseExample.Criteria criteria = userCourseExample.createCriteria();
        int userIds = (int)userId;
        int courseIds = (int)courseId;
        criteria.andCourIdEqualTo(courseIds);
        criteria.andUserIdEqualTo(userIds);
        List<UserCourse> result = userCourseMapper.selectByExample(userCourseExample);
        if(result.size() >0) return CoursesResult.ok();
        else return CoursesResult.build(404,"没有找到该用户的课程信息");
    }
}
