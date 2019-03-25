package com.ourTeam.courseInfo;

import com.ourTeam.common.pojo.CoursesResult;
import com.ourTeam.manager.pojo.CourseDetail;
import com.ourTeam.manager.pojo.CourseInfo;
import com.ourTeam.manager.pojo.UserCourse;

import java.util.List;

public interface CourseInfoService {
    CourseInfo getCourse(long id);
    CourseDetail getCourseDetail(String cour_code);
    //根据课程id得到课程评价
    List<UserCourse> getCourseComment(long id);
    //根据用户id和课程id进行选课
    CoursesResult userSelectCourse(long userId,long courseId);
    CoursesResult checkStatus(long userId,long courseId);
}
