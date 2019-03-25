package com.ourTeam.userCenter;

import com.ourTeam.common.pojo.CoursesResult;
import com.ourTeam.manager.pojo.CourseInfo;
import java.util.List;

public interface UserCenterService {

    //查看用户所选课程
    List<CourseInfo> getCoursesByUserId(long id);
    //用户删除课程
    CoursesResult delectCourse(long userId,long courseId);
    //更改用户信息
    CoursesResult updateUserInfo(long userId,String userName,String userPhone);
    //用户更改密码
    CoursesResult changeUserPassword(long userId,String oldPassword,String newPassword);
    //用户修改评价
    CoursesResult userChangeComment(long userId,long courId,String remark,int star);
}
