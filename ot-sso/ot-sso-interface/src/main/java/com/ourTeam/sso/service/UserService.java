package com.ourTeam.sso.service;

import com.ourTeam.common.pojo.CoursesResult;
import com.ourTeam.manager.pojo.User;

public interface UserService {

    //检查用户输入的数据在数据库中是否存在
    CoursesResult checkData(String param, long type);

    //用户注册
    CoursesResult userRegister(User tbUser);

    //用户登录
    //先去数据库中判断是否能够正常登入，如果不能，则返回
    //如果用户名和密码正确，则生成键值对token，值是用户信息
    //设置过期时间
    //并在controller中将其加入到cookie
    CoursesResult userLogin(String username, String password);

    //在项目的所有下面都能通过浏览器里面的cookie自动登录
    CoursesResult userLoginByToken(String token);

    //根据激活码找到user
    User activeUser(String code) ;
    //更新user
    int updateUser(User user);

    //用户注销
    Long userQuit(String tokenId);

}
