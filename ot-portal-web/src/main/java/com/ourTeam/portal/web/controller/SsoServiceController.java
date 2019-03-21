package com.ourTeam.portal.web.controller;

import com.ourTeam.common.pojo.CoursesResult;
import com.ourTeam.common.utlis.JsonUtils;
import com.ourTeam.manager.pojo.User;
import com.ourTeam.sso.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Controller
public class SsoServiceController {

    @Autowired
    private UserService userService;

    @RequestMapping("/page/login")
    public String getLoginPage(String redirect, Model model)
    {
        model.addAttribute("redirect",redirect);
        return "login";
    }

    @RequestMapping("/new")
    public String getindex(){
        return "new";
    }

    @RequestMapping("/page/register")
    public String getRegisterPage(){
        return "register";
    }


    //邮箱检查
    @RequestMapping("/user/check/{param}/{type}")
    @ResponseBody
    public CoursesResult ckeckDate(@PathVariable String param,@PathVariable long type){
        System.out.println("邮箱检查");
        CoursesResult result = userService.checkData(param,type);
        return result;
    }

    //用户注册
    @RequestMapping("/user/register")
    @ResponseBody
    public CoursesResult userRegister(User user){
        System.out.println("--------");
        user.setState(false);
        user.setCode(UUID.randomUUID().toString().replaceAll("-", ""));
        System.out.println(user);
        CoursesResult result = userService.userRegister(user);
        return result;
    }

    //用户登录
    @RequestMapping("/user/login")
    @ResponseBody
    public CoursesResult userLogin(String email, String password, HttpServletRequest request, HttpServletResponse response){
        System.out.println("userlogin");
        CoursesResult result = userService.userLogin(email,password);
        //将token存入到cookie中返回给客户端
        //cookie默认的实效时间maxAge为-1，即关闭浏览器就实效
        //值得注意的是，我们这个cookie必须要是跨域的，使得以e3mall.cn结尾的域名都能得到这个cookie
        if(result.getStatus() == 200){
            CookieUtils.setCookie(request,response,"token",result.getData().toString());
        }
        return result;
    }

    //用户注销
    @RequestMapping("/user/quitLogin/{tokenId}/{page}")
    public String userQuit(@PathVariable String tokenId,@PathVariable String page,HttpServletRequest request,HttpServletResponse response)throws Exception {
        //删除redis里面的用户信息
        Long result = userService.userQuit(tokenId);
        Cookie cookie = new Cookie("token",null);
        cookie.setPath("/");
        //立马删除
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        //请求重定向到主页
        String location = request.getHeader("Referer");

        return "redirect:/"+ page;

    }

    //在所有该项目的页面下面都能通过cookie自动登入，因为大部分页面下面都有这个ajax请求来判断用户是否已经登录，所以要解决不同端口之间数据跨域的问题
    @RequestMapping(value ="/user/token/{tokenId}",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String userLoginByToken(@PathVariable String tokenId, String callback){
        CoursesResult result = userService.userLoginByToken(tokenId);
        //如果callback不为空，则是一个jsonp请求
        if(StringUtils.isNotBlank(callback)){
            return callback+"("+ JsonUtils.objectToJson(result) +");";
        }
        //cookie我们采用的实效策略是只要关闭浏览器就实效，所以不需要更新实效时间
        return JsonUtils.objectToJson(result);



    }
    //激活邮件处理
    @RequestMapping("/ActiveServlet")
    public String ActiveServlet(String code, ModelMap modelMap) throws Exception {
        //接收激活码，Spring MVC封装好了
        System.out.println("----------------------");
        //根据激活码查询用户
        User user = userService.activeUser(code);
        //查询到用户，修改用户的状态
        if (user!=null){
            //查询到用户
            user.setState(true);
            user.setCode(null);
            //更新用户信息
            userService.updateUser(user);
            modelMap.addAttribute("msg","激活成功，请登录");
            return "success";
        }else {
            //激活码没有查询到该用户
            modelMap.addAttribute("msg","激活码失效，请重新获取");
            return "success";
        }

    }
}
