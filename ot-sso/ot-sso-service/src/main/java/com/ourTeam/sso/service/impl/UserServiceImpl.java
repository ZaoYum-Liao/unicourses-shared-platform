package com.ourTeam.sso.service.impl;

import com.ourTeam.common.pojo.CoursesResult;
import com.ourTeam.common.utlis.EmailUtil;
import com.ourTeam.common.utlis.JsonUtils;
import com.ourTeam.manager.dao.UserMapper;
import com.ourTeam.manager.pojo.User;
import com.ourTeam.manager.pojo.UserExample;
import com.ourTeam.sso.service.JedisClient;
import com.ourTeam.sso.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;


import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper tbUserMapper;

    @Autowired
    private JedisClient jedisClient;

    /**
     * 去数据库中检查用户注册的用户名和手机号
     * @param param
     * @param type
     * @return
     */
    @Override
    public CoursesResult checkData(String param, long type) {
        // 1、从tb_user表中查询数据
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        // 2、查询条件根据参数动态生成。
        //1、2、3分别代表username、phone、email
        if (type == 1) {
            criteria.andUsernameEqualTo(param);
        } else if (type == 2) {
            criteria.andPhoneEqualTo(param);
        }else if (type == 3){
            criteria.andEmailEqualTo(param);
        }
        //执行查询
        List<User> list = tbUserMapper.selectByExample(example);
        // 3、判断查询结果，如果查询到数据返回false。
        if (list.size() > 0) {
            // 4、如果没有返回true。
            return CoursesResult.ok(false);
        }
        // 5、使用e3Result包装，并返回。
        return CoursesResult.ok(true);
    }
    /**
     *  查询该激活码对应的用户，并返回该用户
     * @param code
     * @return
     */
    @Override
    public User activeUser(String code) {
        // 1、从tb_user表中查询数据
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andCodeEqualTo(code);
        //执行查询
        List<User> list = tbUserMapper.selectByExample(example);
        return list.get(0);

    }

    /**
     * 更新用户状态的实现
     * @param user
     * @return
     */
    @Override
    public int updateUser(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(user.getId());
        return tbUserMapper.updateByExample(user,example);
    }

    /**
     * 用户注销功能的实现
     * @param tokenId
     */
    @Override
    public Long userQuit(String tokenId) {
        Long result = jedisClient.del("token:"+tokenId);
        return result;
    }

    /**
     * 用户注册的实现
     * @param tbUser
     * @return
     */
    @Override
    public CoursesResult userRegister(User tbUser) {
        //补全用户的其他信息
        //md5加密过后的密码
        String password = DigestUtils.md5DigestAsHex(tbUser.getPassword().getBytes());
        tbUser.setPassword(password);
        tbUser.setCreated(new Date());
        tbUser.setUpdated(new Date());
        tbUserMapper.insert(tbUser);
        //邮箱授权码：twmfckwfdapfcacj
        //2：zrhombdwolchbigb
        try {
            EmailUtil.sendEmailByWeb(tbUser.getEmail(),tbUser.getCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return CoursesResult.build(200, "激活码已发送,请去邮箱激活账户");
//        System.out.println("123");
//        return CoursesResult.ok();
    }

    /**
     * 用户通过邮箱登录
     * @param email
     * @param password
     * @return
     */
    @Override
    public CoursesResult userLogin(String email, String password) {
        //用户登录
        //先去数据库中判断是否能够正常登入，如果不能，则返回
        System.out.println("youxiang");
        UserExample tbUserExample = new UserExample();
        UserExample.Criteria criteria = tbUserExample.createCriteria();
        //查询邮箱是否存在
        criteria.andEmailEqualTo(email);
        List<User> tbUserList = tbUserMapper.selectByExample(tbUserExample);
        if(tbUserList.size() == 0) return CoursesResult.build(400,"用户名或密码错误");
        //如果用户名存在，则比对密码
        String userPassword = DigestUtils.md5DigestAsHex(password.getBytes());
        User user = tbUserList.get(0);
        System.out.println(user);
        if(! user.getPassword().equals(userPassword)) return CoursesResult.build(1400,"用户名或者密码错误");
        //如果用户名和密码正确，则生成键值对token，值是用户信息
        String token = UUID.randomUUID().toString();
        //将密码清除
        user.setPassword(null);
        jedisClient.set("token"+":"+token, JsonUtils.objectToJson(user));
        //设置过期时间
        jedisClient.expire("token"+":"+token,30*60);
        //并在controller中将其加入到cookie
        return CoursesResult.ok(token);
    }


    /**
     * 通过浏览器中的cookie登录
     * @param token
     * @return
     */
    @Override
    public CoursesResult userLoginByToken(String token) {
        //先去redis缓存中去寻找该session是否存在,redis中key的格式为token:sessionId
        String userInfo = jedisClient.get("token"+":"+token);
        //如果不存在，直接返回结果
        if(StringUtils.isBlank(userInfo)){
            return CoursesResult.build(201,"请重新登录");
        }
        //如果存在，取出session里面的用户信息，并重新更新session的剩余时间
        jedisClient.expire("token"+":"+token,30*60);
        User user = JsonUtils.jsonToPojo(userInfo,User.class);
        return CoursesResult.ok(user);
    }

}
